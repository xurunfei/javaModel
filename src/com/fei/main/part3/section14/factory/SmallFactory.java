package com.fei.main.part3.section14.factory;

import com.fei.main.part3.section14.AutoMobile.AutoMobile;
import com.fei.main.part3.section14.AutoMobile.BigAutoMobile;
import com.fei.main.part3.section14.AutoMobile.SmallAutoMobile;
import com.fei.main.part3.section14.Car.Car;
import com.fei.main.part3.section14.Car.SmallCar;

/**
 * 小型工厂
 * @author xurunfei
 * @date 2017/12/1.
 */
public class SmallFactory implements RookFactory {

    @Override
    public Car CreateCar() {
        return new SmallCar();
    }

    @Override
    public AutoMobile CreateAutoMobile() {
        return new SmallAutoMobile();
    }
}
