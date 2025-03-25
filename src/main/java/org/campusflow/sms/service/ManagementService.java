package org.campusflow.sms.service;

import org.campusflow.sms.entity.ManagementEntity;
import org.campusflow.sms.model.Management;
import org.campusflow.sms.repository.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service

public class ManagementService {
	@Autowired
	ManagementRepository managementRepository; 
	
	@Autowired
	ObjectMapper mapper; 

	public ManagementEntity saveManagement(Management management) {
		 ManagementEntity managementRepo = mapper.convertValue(management, ManagementEntity.class);
		return managementRepository.save(managementRepo); 
	}
	
	
}
