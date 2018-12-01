package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_3 {
    public static void main(String[] args) {
        //验证 limit 不能大于 capacity .
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        try {
            byteBuffer.limit(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
