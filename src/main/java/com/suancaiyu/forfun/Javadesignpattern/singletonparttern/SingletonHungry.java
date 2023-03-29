package com.suancaiyu.forfun.Javadesignpattern.singletonparttern;

import java.lang.reflect.Method;

public class SingletonHungry {
    /**
     * 私有化构造器，无法通过new（）新建对象
     */
    private SingletonHungry(){};
    /**新建一个静态对象
     *
     */
    private static SingletonHungry singleton = new SingletonHungry();
    /**提供一个静态方法获取对象
     *
     * @return
     */
    public static SingletonHungry getInstance(){
        return singleton;
    }

    /**
     * 用于测试反射
     */
    public void test(){};

    public static void main(String[] args) {
        SingletonHungry singleton = SingletonHungry.getInstance();
        System.out.println(singleton);
        Class<SingletonHungry> clazz = SingletonHungry.class;
        try {
            Method test = clazz.getMethod("test");
            System.out.println(test.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
