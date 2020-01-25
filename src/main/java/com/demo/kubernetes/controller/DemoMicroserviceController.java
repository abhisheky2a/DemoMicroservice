package com.demo.kubernetes.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.kubernetes.model.MicroserviceResponse;
import com.demo.kubernetes.service.DemoMicroserviceService;

import io.swagger.annotations.Api;

@Api(value="DemoMicroserviceController", description="Kubernetes Demo")
@RestController
public class DemoMicroserviceController {
	
	@Autowired
	DemoMicroserviceService service;
	
	
	private Logger logger = LoggerFactory.getLogger(DemoMicroserviceController.class);
    
    @GetMapping("/demo/v1/getResponse")
    public MicroserviceResponse getResponse() {
       logger.info("Inside DemoMicroserviceController ...");
       return service.getResponse();
    }
	
	

}
