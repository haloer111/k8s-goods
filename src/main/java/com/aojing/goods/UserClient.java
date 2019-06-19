package com.aojing.goods;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: gexiao
 * @Date: 2019/6/19 09:42
 * @Description:
 */
@FeignClient(name = "user", fallback = UserClientFallback.class, url = "user:8811")
public interface UserClient {

    @GetMapping("api/user/test")
    String test(@RequestParam(name = "str", required = false) String str);
}
