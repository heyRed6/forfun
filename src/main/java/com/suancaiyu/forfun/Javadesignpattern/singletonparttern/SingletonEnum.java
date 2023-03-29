package com.suancaiyu.forfun.Javadesignpattern.singletonparttern;

/**
 * @author heyred
 */

public enum SingletonEnum {
    /**
     * 单例实例
     */
    INSTANCE;

    public String test(){
        return "这是枚举的单例模式";
    }


    public static void main(String[] args) {
        System.out.println(SingletonEnum.INSTANCE.test());
    }
}
