package com.fei.main.part3.section17_1;

import java.util.Date;
import java.util.Random;

public class Die {
    private static Die diel = new Die();
    private static Die die2 = new Die();

    /**
     * 私有的构造子保证外界无法
     * 直接将此类实例化
     */
    private Die() {
    }

    /**
     * 工厂方法
     */
    public static Die getlnstance(int whichOne) {
        if (whichOne == 1) {
            return diel;
        } else {
            return die2;
        }
    }

    /**
     * 掷骰子， 返还一个在 1 6 之间的
     * 随机数
     */
    public synchronized int dice() {
        Date d = new Date();
        Random r = new Random(d.getTime());
        int value = r.nextInt();
        value = Math.abs(value);
        value = value % 6;
        value += 1;
        return value;
    }
}