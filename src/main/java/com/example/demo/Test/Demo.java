package com.example.demo.Test;

import java.nio.ByteBuffer;

public class Demo {
    public static void main(String[] args) throws Exception {
        //创建非直接缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        // ByteBuffer buffer = ByteBuffer.allocateDirect(1024); //创建直接缓冲区
        //初始化缓冲区
        System.out.println("**************init***************");
        show(buf);//1024    0   1024
//        //向缓冲区放置数据
        System.out.println("**************put***************");
        buf.put("abcde".getBytes());
        show(buf);//1024    5   1024
//        //切换成读取模式
        System.out.println("**************flip***************");
        buf.flip();
        show(buf);//1024    0   5
//        //get读取数据
        System.out.println("**************get***************");
        byte[] bytes = new byte[buf.limit()];
        buf.get(bytes);
        System.out.println(new String(bytes));
        show(buf);  //1024  5   5
//        //rewind 重复读数据模式
        System.out.println("**************rewind***************");
        buf.rewind();
        show(buf);  //1024  0   5
//        //clear模式 回到初始模式，但是注意，里面的还是有数据的
        System.out.println("**************clear***************");
        buf.clear();
        show(buf); //1024   0   1024
        System.out.println((char)buf.get());//获取第一个数据       a
        System.out.println((char)buf.get());//获取第一个数据       b
        System.out.println((char)buf.get());//获取第一个数据       c
        System.out.println((char)buf.get());//获取第一个数据       d
    }

    private static void show(ByteBuffer buf){
        System.out.println("capacity:"+buf.capacity());//容量
        System.out.println("position:"+buf.position());//当前位置
        System.out.println("limit   :"+buf.limit());//缓冲区界限
        String a = new String();

    }
}
