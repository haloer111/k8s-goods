package com.aojing.goods.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: gexiao
 * @Date: 2019/6/20 14:22
 * @Description:
 */
@TableName("goods")
@Data
public class Goods {
    private Long id;
    private String name;
}
