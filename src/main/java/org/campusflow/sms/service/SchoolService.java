package org.campusflow.sms.service;


import java.util.HashMap;
import java.util.Map;

import org.campusflow.sms.entity.SchoolEntity;
import org.campusflow.sms.model.Management;
import org.campusflow.sms.model.School;
import org.campusflow.sms.repository.SchoolRepository;
import org.campusflow.sms.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private ObjectMapper mapper;

	@Autowired
	private PasswordUtil passwordUtil;

	@Autowired
	private ManagementService managementService;

	public SchoolEntity save(SchoolEntity school) throws Exception {
		return schoolRepository.save(school);
	}

	public School findByName(String name) throws Exception {
		return mapper.convertValue(schoolRepository.findByName(name), School.class);
	}

	public Page<SchoolEntity> findAll(Pageable page) throws Exception {
		
		return schoolRepository.findAll(page);
	}
	public JsonNode saveSchool(School schoolInput) throws Exception {
		try {
			ObjectNode response = mapper.createObjectNode();
			School isSchoolExist = this.findByName(schoolInput.getName());
			if (isSchoolExist != null)
				return null;
			SchoolEntity savedSchool = this.save(mapper.convertValue(schoolInput, SchoolEntity.class));
			String managementPassword = schoolInput.getPassword();
			schoolInput.setPassword(passwordUtil.hashPassword(managementPassword));
			Management managementUser = new Management(schoolInput.getManagementName(), savedSchool.getId(),
					schoolInput.getEmailId(), schoolInput.getPassword(), schoolInput.getPhone());
			managementService.saveManagement(managementUser);
			response.put("id", savedSchool.getId());
			response.put("message", "School Created Successfully");

			return response;
		} catch (Exception e) {
			throw e;
		}

	}
	
	public Page<SchoolEntity> fetchAllSchool(Map<String, Object>input) throws Exception{
		Pageable pageable = PageRequest.of(Integer.parseInt((String) input.get("pageNumber")) - 1, 10);
		Page<SchoolEntity> schoolList = this.findAll(pageable);
		return schoolList; 
	}

}
