package com.suancaiyu.forfun.Javadesignpattern.abstractfactory;

import com.suancaiyu.forfun.Javadesignpattern.factorymethod.Car;

/**
 * @author heyred
 */
public interface AbstractCar {
    /**
     * 获car
     * @return
     */
    Car getCar();

    /**
     * 获取bus
     * @return
     */
    Bus getBus();
}
