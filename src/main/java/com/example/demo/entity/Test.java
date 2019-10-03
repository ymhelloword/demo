package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Table(name = "test")
@Component
@ConfigurationProperties(prefix = "test")
public class Test {
  @Id
  @GeneratedValue
  private Integer id;
  @Column(name = "a")
  private Integer a;


}
