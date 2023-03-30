package com.suancaiyu.forfun.Javadesignpattern.builder;

/**
 * @author heyred
 */
public interface Builder {

    /**
     * 组装电脑
     * @return
     */
    Computer createComputer();

    /**
     * 设置cpu
     */
    void cpu(String cpu);

    /**
     * 设置主板
     */
    void zhuban(String zhuban);
}
