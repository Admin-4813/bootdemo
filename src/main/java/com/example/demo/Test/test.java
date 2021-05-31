package com.example.demo.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class test {
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("hello world");
//        Object obj1 = new Object();
//        Object obj2=obj1;
//        obj1=null;
//        System.gc();//obj2是强引用，不会被回收
//        System.out.println(obj2);//此处obj2是有地址的
//        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
//    }
//private static test test=null;//声明对象
//
//    private test(){//私有构造器
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("哈哈，构造器执行...."+Thread.currentThread().getName());
//
//    }
//    public static test getInstance(){//获取实例
//        if(test==null){
//            test=new test();
//        }
//        return test;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println(test.getInstance());
//        System.out.println(test.getInstance());
//        System.out.println(test.getInstance());
//
//    }

    private static test singleDemo = null;

    private test() {
        System.out.println(Thread.currentThread().getName() + " create SingleDemo ");
    }

    //DCL (double check lock) 双端检索机制
    public static test getInstance() {
        if (singleDemo == null) {
            synchronized (test.class) {
                if (singleDemo == null) {
                    singleDemo = new test();
                }
            }
        }
        return singleDemo;
    }


    public static void main(String[] args) {
//        //多线程 高并发
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> {
//                test.getInstance();
//            }).start();
//        }

        AtomicInteger atomicInteger = new AtomicInteger(5);
        //CompareAndSet  CAS
        System.out.println(atomicInteger.compareAndSet(5,2020)+" main value is "+atomicInteger.get());//2020
        System.out.println(atomicInteger.compareAndSet(5,1515)+" main value is "+atomicInteger.get());//2020

    }
}
