package com.fei.main.part3.section14;

import com.fei.main.part3.section14.AutoMobile.AutoMobile;
import com.fei.main.part3.section14.Car.Car;
import com.fei.main.part3.section14.factory.RookFactory;
import com.fei.main.part3.section14.factory.SmallFactory;

/**
 * 调用
 * 	一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，
 * 	这对于所有形态的工厂模式都是重要的。
 *  这个系统有多于一个的产品族，而系统<b>只消费其中某一产品族</b>。
 *  <b>同属于同一个产品族的产品是在一起使用的</b>，
 *  这一约束必须在系统的设计中体现出来。系统提供一个产品类的库，
 *  所有的产品以同样的接口出现，从而使客户端不依赖于实现。
 * @author xurunfei
 * @date 2017/12/1.
 */
public class Client {
    public static void main(String[] args) {
//        RookFactory rookFactory = new BigFactory();//大工厂,
        RookFactory rookFactory = new SmallFactory();//小工厂
        Car car = rookFactory.CreateCar();
        car.getRook();
        AutoMobile autoMobile = rookFactory.CreateAutoMobile();
        autoMobile.getRook();
    }
}
