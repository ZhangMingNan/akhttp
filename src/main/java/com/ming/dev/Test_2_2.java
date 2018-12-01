package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_2_2 {
    public static void main(String[] args) {
        //验证 position 不能大于其 limit
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        byteBuffer.limit(2);

        try {
            byteBuffer.position(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
