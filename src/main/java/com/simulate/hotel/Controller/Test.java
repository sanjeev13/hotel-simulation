package com.simulate.hotel.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String healthStatus(){
        return "Application is running";
    }
}
