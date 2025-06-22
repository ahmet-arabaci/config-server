package com.ahmetarabaci.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetarabaci.configclient.service.ConfigClientService;

@RestController
public class ConfigClientController {

	@Autowired
	private ConfigClientService service;
	
	@GetMapping("/getproperty")
	public String getProperty() {
		return service.getProperty();
	}
}
