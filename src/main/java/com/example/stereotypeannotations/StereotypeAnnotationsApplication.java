package com.example.stereotypeannotations;


import com.example.stereotypeannotations.controller.DemoController;
import com.example.stereotypeannotations.repository.DemoRepo;
import com.example.stereotypeannotations.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StereotypeAnnotationsApplication {

    public static void main(String[] args) {
     var context = SpringApplication.run(StereotypeAnnotationsApplication.class, args);
     DemoRepo demoRepo  =context.getBean(DemoRepo.class);
     DemoController demoController  = context.getBean(DemoController.class);
        DemoService demoService = context.getBean(DemoService.class);
     String str  =demoRepo.Hellorepo();
     String str1 =demoController.helloController();
     String str2 =demoService.helloService();
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);


    }

}
