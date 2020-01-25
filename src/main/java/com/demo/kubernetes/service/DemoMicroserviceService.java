package com.demo.kubernetes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.kubernetes.configuration.MicroserviceConfiguration;
import com.demo.kubernetes.model.MicroserviceResponse;
import com.demo.kubernetes.model.MockMicroserviceResponse;
import com.demo.kubernetes.proxy.MockServiceProxy;

@Service
public class DemoMicroserviceService {
	
	@Autowired
	MicroserviceConfiguration config;
	
	@Autowired
	MicroserviceResponse response;
	
	@Autowired
	MockMicroserviceResponse mockMocroserviceResponse;
	
	@Autowired
	MockServiceProxy proxy;
	
	public MicroserviceResponse getResponse()
	{
		mockMocroserviceResponse = proxy.getResponse(config.getFunction());
		response.setName(config.getName());
		response.setFunction(mockMocroserviceResponse.getFunctionName());
		response.setCity(mockMocroserviceResponse.getCity());
		response.setFirstName(mockMocroserviceResponse.getFirstName());
		response.setLastName(mockMocroserviceResponse.getLastName());
		response.setState(mockMocroserviceResponse.getState());
		return response;
	}

}
