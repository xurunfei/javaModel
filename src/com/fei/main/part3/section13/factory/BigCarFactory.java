package com.fei.main.part3.section13.factory;

import com.fei.main.part3.section13.BigCar;
import com.fei.main.part3.section13.Car;

/**
 * 大客车工厂
 *
 * @author xurunfei
 * @date 2017/12/1.
 */
public class BigCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new BigCar();
    }
}
