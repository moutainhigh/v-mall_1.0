package com.vmall.vauth.service.tool;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class TokenService {

    @Resource
    RedisTemplate redisTemplate;
    @Resource
    StringRedisTemplate stringRedisTemplate;
    public String set(Object obj){
        StringBuilder token=new StringBuilder();
        token.append("token:");
        token.append(new SimpleDateFormat("yyMMddHHmmSS").format(new Date())+"-"+Math.random()*100000);
        ValueOperations<String,Object> operations=redisTemplate.opsForValue();
        operations.set(token.toString(),obj);
        redisTemplate.expire(token.toString(),15,TimeUnit.MINUTES);
        return token.toString();
    }
    public void setCode(String token,Object obj){
        ValueOperations<String,Object> operations=redisTemplate.opsForValue();
        operations.set(token,obj);
        redisTemplate.expire(token,15,TimeUnit.MINUTES);
    }
    public Object get(String token){
        ValueOperations<String,Object> operations=redisTemplate.opsForValue();
        Object OBJ=operations.get(token);
        return OBJ;
    }
    public long getexpire(String token){
        return redisTemplate.getExpire(token);
    }
    public void del(String token){
        redisTemplate.delete(token);
    }
}
