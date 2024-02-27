package com.newcode.community;

import com.newcode.community.service.AlphaService;
import org.apache.kafka.common.protocol.types.Field;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class TransactionTests {

    @Autowired
    private AlphaService alphaService;


    @Test
    public void testSave1(){
        Object obj = alphaService.save1();
        System.out.println(obj);

    }

    @Test
    public void testSave2(){
        Object obj = alphaService.save2();
        System.out.println(obj);

    }


}


