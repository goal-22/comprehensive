package com.goal.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GoodsMapperTest {

    @Autowired
    GoodsMapper goodsMapper;

    @Test
    public void test1(){
        System.out.println(goodsMapper.selectCount(null));
    }

}