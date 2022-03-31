package com.goal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_goods")
public class Goods {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField("goods_name")
    private String name;
    @TableField("goods_title")
    private String title;
    @TableField("goods_img")
    private String img;
    @TableField("goods_detail")
    private String detail;
    @TableField("goods_price")
    private Float price;
    @TableField("goods_stock")
    private Long stock;

}
