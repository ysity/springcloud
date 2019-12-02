package com.crescentd.controller;

import com.crescentd.entity.Student;
import com.crescentd.repository.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private FeignClients feignClients;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignClients.findAll();
    }
    @GetMapping("/index")
    public String index(){
        return feignClients.index();
    }
}
