package com.fei.main.part3.section12;

/**
 * 汽车工厂
 * @author xurunfei
 * @date 2017/12/5.
 */
public class RookFactory {
    public static Car createRook(String type){
        Car car = null;
        switch (type){
            case "bigCar":
                car = new BigCar();
                break;
            case "smallCar":
                car = new SmallCar();
                break;
        }
        return car;
    }
}
