package com.yangtao.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author yangtao
 * @description
 * @create 2021-02-25 9:06
 */
public class IDutils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }

}
