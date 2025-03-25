package org.campusflow.sms.controller;

import org.campusflow.sms.model.Teacher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/sms")



public class TeacherController {
   
	@PostMapping("/teacher")
	@ResponseBody
	public ResponseEntity<Object> createTeacher(@RequestBody Teacher teacherInput)throws Exception{
		try {
			 return ResponseEntity.status(HttpStatus.OK).body("message"+"Ok"); 
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error creating school " + e.getMessage());
		}
	}
}
