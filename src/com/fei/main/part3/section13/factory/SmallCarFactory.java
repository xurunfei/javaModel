package com.fei.main.part3.section13.factory;

import com.fei.main.part3.section13.Car;
import com.fei.main.part3.section13.SmallCar;
import com.fei.main.part3.section13.factory.CarFactory;

/**
 * 小客车工厂
 * @author xurunfei
 * @date 2017/12/1.
 */
public class SmallCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SmallCar();
    }
}
