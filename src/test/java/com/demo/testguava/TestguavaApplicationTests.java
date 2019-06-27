package com.demo.testguava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestguavaApplicationTests {

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void contextLoads() {

        jedisCluster.set("a","a");
        String s = jedisCluster.get("a");
        System.out.println(s);

    }

}
