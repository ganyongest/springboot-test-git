package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("test")
public class SpringbootTestGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestGitApplication.class, args);
    }

    @RequestMapping("hello")
    public  String hello() {
        System.out.println("fadfgrd");
        return  "success34546";
    }
}
