package com.suancaiyu.forfun.Javadesignpattern.abstractfactory;

import com.suancaiyu.forfun.Javadesignpattern.factorymethod.Car;

/**
 * @author heyred
 */
public class CarFactory implements AbstractCar {

    @Override
    public Car getCar() {
        return new Tesla();
    }

    @Override
    public Bus getBus() {
        return new Dazong();
    }
}
