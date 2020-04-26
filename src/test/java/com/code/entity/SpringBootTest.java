package com.code.entity;

import org.junit.jupiter.api.Test;

@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {

    @Test
    void testpojo(){
        AccountReceivableDetail ar=new AccountReceivableDetail();
        ar.setRemark("蝴蝶");

        System.out.println(ar.getRemark());
    }
}
