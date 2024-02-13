package in.anil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.anil.binding.SsaRequestForm;
import in.anil.service.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@PostMapping("/get-state")
	public ResponseEntity<String> checkIfValidApplication(@RequestBody SsaRequestForm ssaRequestForm) {
		boolean status = applicationService.checkValidApplication(ssaRequestForm);
		return (status) ? new ResponseEntity<String>("application registered!", HttpStatus.CREATED) : new ResponseEntity<String>("application denied!", HttpStatus.BAD_REQUEST);
	}

}
