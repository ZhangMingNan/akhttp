package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_1_2 {
    public static void main(String[] args) {
        //验证 limit 不能设置为空值.
        try {
            byte[] bytes = new byte[]{1,2,3};
            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            byteBuffer.limit(-1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
