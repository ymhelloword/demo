package com.example.demo.controller;

import com.example.demo.entity.User1;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zjl
 * @Date 2019/6/24 14:47
 */
@RestController
public class HelloController {
    private ObjectMapper objectMapper = new ObjectMapper( );

    @RequestMapping("/hello")
    public String hello( ) throws JsonProcessingException {
        User1 user = new User1( );
        user.setId(1);
        user.setName("ym");
        Map result = new HashMap();
        result.put("user", user);
        return objectMapper.writeValueAsString(result);
    }
}
