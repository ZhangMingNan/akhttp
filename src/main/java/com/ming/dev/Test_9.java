package com.ming.dev;

import java.nio.CharBuffer;

public class Test_9 {
    //判断当前位置与限制之间是否有剩余元素
    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c'};
        CharBuffer charBuffer = CharBuffer.wrap(chars);
        charBuffer.limit(3);

        charBuffer.position(2);
        //打印 position 和 limit 之间的差值。
        System.out.println(charBuffer.remaining());

    }
}
