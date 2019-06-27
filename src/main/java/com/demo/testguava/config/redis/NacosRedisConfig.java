package com.demo.testguava.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


// 动态配置
//@NacosPropertySource(dataId = "com.jdd.yunc.common.redis", groupId = "yunc:common")
@Component
public class NacosRedisConfig {

    @Value(value = "${redis.maxWaitMillis}")
    private long maxWaitMillis;

    @Value(value = "${redis.maxTotal}")
    private int maxTotal;

    @Value(value = "${redis.minIdle}")
    private int minIdle;

    @Value(value = "${redis.maxIdle}")
    private int maxIdle;

    @Value(value = "${redis.hostAndPorts}")
    private String hostAndPorts;

    @Value(value = "${redis.connectionTimeout}")
    private int connectionTimeout;

    @Value(value = "${redis.soTimeout}")
    private int soTimeout;

    @Value(value = "${redis.maxAttempts}")
    private int maxAttempts;

    public long getMaxWaitMillis() {
        return maxWaitMillis;
    }

    public void setMaxWaitMillis(long maxWaitMillis) {
        this.maxWaitMillis = maxWaitMillis;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(int maxTotal) {
        this.maxTotal = maxTotal;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public String getHostAndPorts() {
        return hostAndPorts;
    }

    public void setHostAndPorts(String hostAndPorts) {
        this.hostAndPorts = hostAndPorts;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }
}
