package com.ming.dev;

import java.nio.ByteBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_4_1 {
    public static void main(String[] args) {
        //理解 如果定义了 maark ,则在将 position 或者 limit 调整为小于该 mark 的值时,该 mark被丢弃.
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        byteBuffer.position(1);
        byteBuffer.mark();
        System.out.println("byteBuffer 在 " + byteBuffer.position() + "位置上设置了标记.");

        byteBuffer.position(2);
        byteBuffer.reset();
        System.out.println("byteBuffer 回到" + byteBuffer.position() + "位置上.");
        //上面的代码说明了, 如果定义了 mark , 则 将 position 调整到大于此 mark 的位置上时 mark不被丢弃.
    }
}
