package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_4_4 {
    //验证, 如果定义了 mark, 将 limit调整为 小于该 mark的值是,此 mark 被丢弃.
    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        System.out.println("a byte buffer position=" + byteBuffer.position() + "limit = " + byteBuffer.limit());

        byteBuffer.position(3);
        byteBuffer.mark();
        System.out.println("b byte buffer position=" + byteBuffer.position() + "limit = " + byteBuffer.limit());

        byteBuffer.position(2);
        byteBuffer.limit(2);
        System.out.println();
        System.out.println("c byte buffer position=" + byteBuffer.position() + "limit = " + byteBuffer.limit());

        try{
            byteBuffer.reset();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
