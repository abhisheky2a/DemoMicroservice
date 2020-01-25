package com.demo.kubernetes.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.kubernetes.model.MockMicroserviceResponse;


@FeignClient(name="mock-microservice")
//@RibbonClient(name="mock-microservice")
public interface MockServiceProxy {
	
    @GetMapping("/mock/v1/getMockResponse/{functionName}")
    public MockMicroserviceResponse getResponse(@PathVariable("functionName") String functionName);
    

}
