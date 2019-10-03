package com.example.demo;

import com.example.demo.dao.TestDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private TestDAO testDAO;
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads( ) {
        com.example.demo.entity.Test test = ( com.example.demo.entity.Test ) applicationContext.getBean("test");
        System.out.println(test) ;
    }

}
