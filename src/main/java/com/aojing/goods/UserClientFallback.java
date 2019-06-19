package com.aojing.goods;

import org.springframework.stereotype.Component;

/**
 * @Auther: gexiao
 * @Date: 2019/6/19 09:43
 * @Description:
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public String test(String str) {
        return null;
    }
}
