package com.example.springbootmavendemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

       @RequestMapping("/_")
       public String index()
       {
              return "Hello this is my SpringBoot Project";
       }
 }


