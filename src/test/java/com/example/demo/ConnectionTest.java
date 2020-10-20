package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


/**
 * @author zhanglifeng
 * @since 2020-10-20 15:29
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConnectionTest {
    @Autowired
    DataSource dataSource;
    @Test
    public void test() throws  Exception{
        System.out.println(dataSource.getConnection());
    }
}
