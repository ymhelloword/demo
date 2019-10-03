package com.example.demo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author zjl
 * @Date 2019/6/24 14:50
 */
@Component
@ConfigurationProperties(prefix = "user1")
@Data
public class User1 implements Serializable {
    private String name;
    private int id;

}
