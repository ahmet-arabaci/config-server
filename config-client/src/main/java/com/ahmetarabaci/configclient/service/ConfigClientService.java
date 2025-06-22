package com.ahmetarabaci.configclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.ahmetarabaci.configclient.config.ConfigClientDto;

@Service
public class ConfigClientService {
	
	@Value("${spring.profiles.active:default}")
	private String activeProfile;
	
	// # 1st WAY: @Value Annotation
	/*
	@Value("${test.prop.intdata}")
	private int intData;
	
	@Value("${test.prop.stringdata}")
	private String stringData;
	
	@Value("${test.prop.listdata}")
	private List<String> listData;
	*/
	
	// # 2nd WAY: @ConfigurationProperties Annotation
	@Autowired
	private ConfigClientDto config;
	
	@GetMapping("/getproperty")
	public String getProperty() {
		return "Active Profile: " + activeProfile +
				"\ntest.prop.intdata: " + config.getIntdata() + 
				"\ntest.prop.stringdata: " + config.getStringdata() + 
				"\ntest.prop.listdata: " + config.getListdata();
	}
	
}
