package com.example.stereotypeannotations.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String helloService() {
        return "Service class";
    }
}
