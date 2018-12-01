package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_1_1 {
    public static void main(String[] args) {
        //验证 capacity不能设置为空, 设置为
        try{
            ByteBuffer.allocate(-1);
        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
