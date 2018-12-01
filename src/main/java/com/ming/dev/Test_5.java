package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_5 {

    //验证 如果没有定义 mark 调用 reset方法会抛出异常
    public static void main(String[] args) {

        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        try{
            byteBuffer.reset();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
