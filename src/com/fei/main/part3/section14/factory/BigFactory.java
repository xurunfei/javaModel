package com.fei.main.part3.section14.factory;

import com.fei.main.part3.section14.AutoMobile.AutoMobile;
import com.fei.main.part3.section14.AutoMobile.BigAutoMobile;
import com.fei.main.part3.section14.Car.BigCar;
import com.fei.main.part3.section14.Car.Car;

/**
 * 大型工厂
 * @author xurunfei
 * @date 2017/12/1.
 */
public class BigFactory implements RookFactory {

    @Override
    public Car CreateCar() {
        return new BigCar();
    }

    @Override
    public AutoMobile CreateAutoMobile() {
        return new BigAutoMobile();
    }
}
