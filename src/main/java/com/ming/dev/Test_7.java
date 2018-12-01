package com.ming.dev;

import java.nio.CharBuffer;

/**
 * 作者：张明楠
 * 时间：2018/11/30
 */
public class Test_7 {
    public static void main(String[] args) {
        //验证当 limit  和 position 被设置成一样的时候,写入数据会抛出异常.

        char[] chars = new char[]{'a','b','c'};

        CharBuffer wrap = CharBuffer.wrap(chars);

        System.out.println("capacity:"+wrap.capacity()+"position:"+wrap.position()+"limit:"+wrap.limit());

        wrap.position(1);
        wrap.limit(1);

        //下面操作会抛出异常.
        wrap.put('z');

    }
}
