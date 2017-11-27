package com.ehootu.redis;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * @Title:RedisTest
 * @Author: KongXiaoPing
 * @Date: 2017-11-02 17:41
 * @Description:
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis  jedis = new Jedis("192.168.2.100",6379);
        System.out.println(jedis.ping());

        jedis.set("k1","v1");
        jedis.set("k2","v2");
        jedis.set("k3","v3");
        jedis.set("k4","v4");

        Set<String> set = jedis.keys("*");
        System.out.println(set);

        jedis.lpush("list01","01","02","03","04");
        List<String> list = jedis.lrange("list01",0,-1);
        for (String s : list) {
            System.out.println(s);
        }



    }
}