package com.fei.main.part3.section14.factory;

import com.fei.main.part3.section14.AutoMobile.AutoMobile;
import com.fei.main.part3.section14.Car.Car;

/**
 * 车工厂
 *
 * @author xurunfei
 * @date 2017/12/1.
 */
public interface RookFactory {
    /**
     * 创建大客车
     * @author: xurunfei
     * @date: 2017/12/1 17:25
     */
    Car CreateCar();
    /**
     * 创建汽车
     * @author: xurunfei
     * @date: 2017/12/1 17:26
     */
    AutoMobile CreateAutoMobile();
}
