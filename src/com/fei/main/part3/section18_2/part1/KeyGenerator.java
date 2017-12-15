package com.fei.main.part3.section18_2.part1;

/**
 * 序列建生成器(方案一)
 *
 * @author xurunfei
 * @date: 2017/11/30 16:27
 */
public class KeyGenerator {
    private static KeyGenerator keygen =
            new KeyGenerator();
    private int key = 1000;

    /**
     * 私有构造子， 保证外界无法直接实例化
     */
    private KeyGenerator() {
    }

    /**
     * 静态工厂方法， 提供自己的实例
     */
    public static KeyGenerator getlnstance() {
        return keygen;
    }

    /**
     * 取值方法， 提供下一个合适的键值
     */
    public synchronized int getNextKey() {
        return key++;
    }
}