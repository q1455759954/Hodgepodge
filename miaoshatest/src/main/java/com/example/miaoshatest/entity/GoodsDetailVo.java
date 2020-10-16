package com.example.miaoshatest.entity;

import com.example.miaoshatest.dao.bean.MiaoShaUser;
import lombok.Data;


@Data
public class GoodsDetailVo {

    private int miaoshaStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods ;
    private MiaoShaUser user;
}
