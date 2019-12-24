package com.ang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomRibbonController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("custom/ribbon/test")
    public String test(){
        return restTemplate.getForObject("http://eureka-client/client/test",String.class);
    }
}
