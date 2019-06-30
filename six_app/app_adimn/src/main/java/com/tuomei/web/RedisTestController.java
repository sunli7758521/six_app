package com.tuomei.web;


import com.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisTestController {

    /**
     *
     */
    @Autowired
    public RedisUtils redisUtil;


    /**
     *@Description: 测试redis
     *@param key, value
     *@return Object
     *@Author: zyj 2018/5/26 8:46
     */
    @RequestMapping("/test")
    @ResponseBody
    public  Object testRedisAdd(){

        String key ="name";
        String value="sunli";

        redisUtil.set(key,value);
                System.out.println("key = [" + key + "], value = [" + value + "]");

        return redisUtil.get(key);

    }


}
