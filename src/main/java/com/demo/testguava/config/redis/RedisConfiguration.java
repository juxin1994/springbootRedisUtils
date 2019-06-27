package com.demo.testguava.config.redis;

import com.google.common.collect.Sets;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.Set;

@Configuration
public class RedisConfiguration {

    @Autowired
    private NacosRedisConfig nacosRedisConfig;

    @Bean
    public JedisCluster getJedisCluster() {
        Set<HostAndPort> hostAndPorts = Sets.newHashSet();
        String hostAndPortsString = nacosRedisConfig.getHostAndPorts();
        String[] arr = hostAndPortsString.split(";");
        for (String str : arr) {
            String[] split = str.split(":");
            hostAndPorts.add(new HostAndPort(split[0], Integer.valueOf(split[1])));
        }

        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxWaitMillis(nacosRedisConfig.getMaxWaitMillis());
        config.setMaxTotal(nacosRedisConfig.getMaxTotal());
        config.setMinIdle(nacosRedisConfig.getMinIdle());
        config.setMaxIdle(nacosRedisConfig.getMaxIdle());


        JedisCluster jedisCluster = new JedisCluster(hostAndPorts, nacosRedisConfig.getConnectionTimeout(),
                nacosRedisConfig.getSoTimeout(), nacosRedisConfig.getMaxAttempts(), config);

        return jedisCluster;
    }
}
