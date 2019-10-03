package com.example.demo.dao;

import com.example.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public interface TestDAO extends JpaRepository<Test,Integer> , JpaSpecificationExecutor <Test>, Serializable {
}
