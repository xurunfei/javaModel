package com.fei.main.part3.section13;

import com.fei.main.part3.section13.factory.BigCarFactory;
import com.fei.main.part3.section13.factory.CarFactory;

/**
 * 调用
 * 	当一个类不知道它所必须创建对象的类或一个类希望由子类来指定它所创 建的对象时，
 *  当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候，
 *  可以使用工厂方法。
 * @author xurunfei
 * @date 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
        CarFactory freightCarFactory = new BigCarFactory();

        Car freightCar = freightCarFactory.createCar();
        freightCar.getRook();
    }
}
