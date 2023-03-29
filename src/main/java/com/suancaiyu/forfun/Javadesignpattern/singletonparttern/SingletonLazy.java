package com.suancaiyu.forfun.Javadesignpattern.singletonparttern;

public class SingletonLazy {

    private SingletonLazy(){};
    private static SingletonLazy singletonLazy = null;
    //双重锁
    private static volatile SingletonLazy singletonLazy1 = null;
    /**
     * 同步代码块实现线程安全
     * @return
     */
    public static synchronized SingletonLazy getInstance(){
        if (singletonLazy==null){
            singletonLazy=new SingletonLazy();
        }
        return singletonLazy;
    }

    /**
     * 双重锁实现多线程同步
     * @return
     */
    public static SingletonLazy getInstance1(){
        if (singletonLazy1 ==null){
            synchronized (SingletonLazy.class){
                if (singletonLazy1==null) {
                    singletonLazy1 = new SingletonLazy();
                }
            }
        }
        return singletonLazy1;
    }
    /**
     * 内部静态类 // TODO: 2023/3/29
     */

}
