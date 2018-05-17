package com.hl.springbootdemo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class IndexController {
    @ApiIgnore
    @RequestMapping("/index")
    public ResponseEntity helloWorld(){
        return ResponseEntity.ok("hello world");
    }
}
