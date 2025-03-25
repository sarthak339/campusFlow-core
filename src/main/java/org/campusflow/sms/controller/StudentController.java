package org.campusflow.sms.controller;


import java.util.HashMap;
import java.util.Map;
import org.campusflow.sms.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class StudentController {
	@PostMapping("/student")
	@ResponseBody
	public ResponseEntity<Object> student(@RequestBody Student student)throws Exception{
		try {
			Map<String, String> response = new HashMap<>(); 
			response.put("result", "ok"); 
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error creating school " + e.getMessage());
		}
		 
	}
}
