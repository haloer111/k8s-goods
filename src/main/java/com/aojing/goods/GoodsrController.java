package com.aojing.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: gexiao
 * @Date: 2019/6/19 09:16
 * @Description:
 */
@RestController
@RequestMapping("api/goods")
public class GoodsrController {

    @Autowired
    private UserClient userClient;

    @GetMapping("test")
    public String test(@RequestParam(name = "str",required = false) String str){
        return "商品服务的响应，传入参数为："+str;
    }

    @GetMapping("feign")
    public String feign(){
        return userClient.test("我是商品服务");
    }

}
