package com.ahmetarabaci.configclient.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "test.prop")
public class ConfigClientDto {

	private int intdata;
	private String stringdata;
	private List<String> listdata;
	
	public int getIntdata() {
		return intdata;
	}
	public void setIntdata(int intdata) {
		this.intdata = intdata;
	}
	public String getStringdata() {
		return stringdata;
	}
	public void setStringdata(String stringdata) {
		this.stringdata = stringdata;
	}
	public List<String> getListdata() {
		return listdata;
	}
	public void setListdata(List<String> listdata) {
		this.listdata = listdata;
	}
		
}
