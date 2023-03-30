package com.suancaiyu.forfun.Javadesignpattern.builder;

/**
 * @author heyred
 */
public class Builders{

    private Computer computer = new Computer();

    public Computer builder() {
        return computer;
    }

    public Builders cpu(String cpu) {
          computer.setCpu(cpu);
          return this;
    }

    public Builders zhuban(String zhuban) {
           computer.setZhuban(zhuban);
           return  this;
    }

    public static void main(String[] args) {
        Computer computer = new Builders().cpu("i9").zhuban("z790").builder();
        System.out.println(computer);
    }
}
