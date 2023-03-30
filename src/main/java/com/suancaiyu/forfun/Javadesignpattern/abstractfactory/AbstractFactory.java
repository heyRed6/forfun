package com.suancaiyu.forfun.Javadesignpattern.abstractfactory;

/**
 *抽象工厂模式是指：提供一个创建一系列或相关依赖对象的接口，无须指定他们具体的类
 *主要角色; 1.抽象工厂：提供创建产品的接口，可以创建多个不同等级的产品
 *          2.具体工厂：主要实现抽象工厂的抽象方法，完成具体的产品的创建
 *          3.抽象产品; 定义了产品的规范，描述产品特征，抽象工厂模式有多个抽象产品
 *          4.具体产品：实现了抽象产品定义的接口，由具体的工厂创建 和具体工厂是多对一的关系
 * @author heyred
 */
public class AbstractFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        String bus = carFactory.getBus().bus();
        String save = carFactory.getCar().save();
        System.out.println(bus);
        System.out.println(save);
    }
}
