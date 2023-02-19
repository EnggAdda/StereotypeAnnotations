package com.example.stereotypeannotations.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String helloController() {
        return   "This is Controller class";
    }
}
