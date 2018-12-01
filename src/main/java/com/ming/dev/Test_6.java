package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_6 {
    //验证 如果设置 limit 时给定的 值 小于 position 则 position 的值就会被设置为 limit 的值.
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        byteBuffer.position(3);

        System.out.println("limit : "+ byteBuffer.limit() );

        byteBuffer.limit(2);

        System.out.println();

        System.out.println("bytebuffer limit 2 之后的位置:" +byteBuffer.position());

    }
}
