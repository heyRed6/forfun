package com.suancaiyu.forfun.Javadesignpattern.abstractfactory;

import com.suancaiyu.forfun.Javadesignpattern.factorymethod.Car;

/**
 * @author heyred
 */
public class Tesla implements Car {
    @Override
    public String save() {
        return "tesla";
    }
}
