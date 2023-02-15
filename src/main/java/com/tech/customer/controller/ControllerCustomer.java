package com.tech.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.customer.exception.ServerException;
import com.tech.customer.service.ServiceCustomer;



@RestController
@RequestMapping("/api/operation")
public class ControllerCustomer {
	@Autowired
	private ServiceCustomer serviceCustomer;
	
	//average
	@GetMapping("/average")
	public ResponseEntity<Double> average() {	
		
		try {
			Double average = null;
			average = this.serviceCustomer.averageByCustomer();
			return new ResponseEntity<>(average, HttpStatus.OK);
		}catch (Exception e) {
			throw new ServerException(e.getMessage());
		}
	}
	
	@GetMapping("/standard")
	public ResponseEntity<Double> standardDeviation() {	
		try {
			Double stDeviation = null;
			stDeviation = this.serviceCustomer.standardDeviation();
			return new ResponseEntity<>(stDeviation, HttpStatus.OK);
		}catch(Exception e) {
			throw new ServerException(e.getMessage());
		}
		
	}
}
