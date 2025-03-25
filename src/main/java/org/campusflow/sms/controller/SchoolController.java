package org.campusflow.sms.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.campusflow.sms.model.School;
import org.campusflow.sms.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/api/sms")
public class SchoolController {

	@Autowired
	SchoolService schoolService;

	@PostMapping("/school")
	@ResponseBody
	public ResponseEntity<Object> CreateSchool(@RequestBody School schoolInput) throws Exception {
		try {
			JsonNode result = schoolService.saveSchool(schoolInput);
			HashMap<String, Object> response = new HashMap<>(1);
			if (result==null) {
				 HashMap<String, Object> msg  = new HashMap<>(); 
				 msg.put("message", "School with same name already exist!!");
				response.put("result", msg); 
			}
			else {
				
				response.put("result", result);
			}
			return ResponseEntity.status(result==null?HttpStatus.CONFLICT:HttpStatus.OK).body(response);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error creating school " + e.getMessage());
		}
	}
	
	@GetMapping("/school")
	@ResponseBody
	public ResponseEntity<Object>GetSchoolList(@RequestParam(value = "page", required = false) Optional<Integer> pageNumber) throws Exception{
		try {
			Map<String, Object> input = new HashMap<String, Object>(1);
			input.put("pageNumber", String.valueOf(pageNumber.isPresent() && (pageNumber.get() >= 1) ? pageNumber.get() : 1));
			return ResponseEntity.status(HttpStatus.OK).body(schoolService.fetchAllSchool(input)); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error creating school " + e.getMessage());
		}
	}
	
	
	

}
