package com.sky.controller.user;

import com.sky.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("userShopController")
@Slf4j
@RequestMapping("/user/shop")

public class ShopController {
    private static final String KEY = "SHOP_STATUS";
    @Autowired
    private RedisTemplate redisTemplate;



    @GetMapping("/status")

    public Result<Integer> getstatus() {
        Integer status = (Integer) redisTemplate.opsForValue().get(KEY);
        log.info("获取到店铺的营业状态为:" + status);
        return Result.success(status);
    }
}
