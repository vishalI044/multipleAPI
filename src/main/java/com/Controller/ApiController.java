package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Response.ApiEntity;
import com.Response.ApiEntityOne;
import com.Service.ApiService;

@RestController
public class ApiController {

	@Autowired
	public ApiService apiService;
	
	@PostMapping("/h1")
	public ResponseEntity<ApiEntity> getData() {
		return new ResponseEntity<>(apiService.firstApi(), HttpStatus.OK);
	}
	
	@PostMapping("/h2")
	public ResponseEntity<ApiEntity> getDataCopy(){
		return new ResponseEntity<>(apiService.secondApi(), HttpStatus.OK);
	}
	
	@PostMapping("/h3")
	public ResponseEntity<ApiEntityOne> getStocks(){
		return new ResponseEntity<>(apiService.thirdApi(), HttpStatus.OK);
	}
}
