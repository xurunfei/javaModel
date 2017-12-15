package com.fei.main.part3.section18_3;

import java.util.HashMap;

/**
 * 多例模式
 *
 * @author xurunfei
 * @date: 2017/12/1 10:56
 */
public class KeyGenerator {
    private static HashMap<String,KeyGenerator> kengens
            = new HashMap<>(10);
    private static final int POOL_SIZE = 20;
    private KeyInfo keyinfo;

    /**
     * 私有构造子， 保证外界无法直接实例化
     */
    private KeyGenerator() {
    }

    /**
     * 私有构造子， 保证外界无法直接实例化
     */
    private KeyGenerator(String keyName) {
        keyinfo = new KeyInfo(POOL_SIZE, keyName);
    }

    /**
     * 静态工厂方法， 提供自己的实例
     */
    public static synchronized KeyGenerator
    getInstance(String keyName) {
        KeyGenerator keygen;
        if (kengens.containsKey(keyName)) {
            keygen = (KeyGenerator)
                    kengens.get(keyName);
        } else {
            keygen = new KeyGenerator(keyName);
        }
        return keygen;
    }

    /**
     * 取值方法， 提供下一个合适的键值
     */
    public synchronized int getNextKey()
    {
        return keyinfo.getNextKey();
    }
}