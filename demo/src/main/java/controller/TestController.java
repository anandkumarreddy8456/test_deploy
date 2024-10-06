package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "Hello";
    }
    @GetMapping("/hi")
    public String test3(){
        return "hi how are you";
    }
}
