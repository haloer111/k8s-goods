package com.aojing.goods.controller;

import com.aojing.goods.UserClient;
import com.aojing.goods.dao.GoodsMapper;
import com.aojing.goods.entity.Goods;
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

    @Autowired
    private GoodsMapper goodsMapper;

    @GetMapping("test")
    public String test(@RequestParam(name = "str",required = false) String str){
        Goods goods = goodsMapper.selectById(1);

        return "商品服务的响应，传入参数为："+str+"，查询数据："+goods.getName();
    }

    @GetMapping("feign")
    public String feign(){
        Goods goods = goodsMapper.selectById(1);
        return userClient.test(goods.getName());
    }

}
