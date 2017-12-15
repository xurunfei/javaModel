package com.fei.main.part3.section19_1Builder.part1;

public class Director {
    private Builder builder;

    /**
     * 产品构造方法， 负责调用各个零件建造方法
     */
    public Product construct() {
        builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        return builder.retrieveResult();
        //continue with other code
    }
}