package com.fei.main.part3.section12;

/**
 * 调用
 * @author xurunfei
 * @date 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        Car freightCar = RookFactory.createRook("bigCar");
        freightCar.getRook();//生产车
    }
}
