package com.springBootWithDocker.spring_boot_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class CustomController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from spring-boot-with-docker";
    }
    
}
