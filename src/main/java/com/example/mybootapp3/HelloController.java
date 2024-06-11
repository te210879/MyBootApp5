package com.example.mybootapp3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Hello world!
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "Hello,Spring Boot!";
    }
    @RequestMapping("/taro")
    public String taro(){
        return "Taro desu!";
    }
}
