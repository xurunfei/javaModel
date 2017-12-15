package com.fei.main.part3.section19_1Builder.part3;

public class Director {
    Builder builder;
    /**
     * 构 造 子
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法， 负责调用各零件建造方法
     */
    public void construct(String toAddress,
                          String fromAddress) {
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}