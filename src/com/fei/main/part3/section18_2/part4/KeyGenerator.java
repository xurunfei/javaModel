package com.fei.main.part3.section18_2.part4;

import java.util.HashMap;

/**
 * 键值序列器(多对键值缓存)
 *
 * @author xurunfei
 * @date: 2017/12/1 10:40
 */
public class KeyGenerator {
    private static KeyGenerator keygen =
            new KeyGenerator();
    private static final int POOL_SIZE = 20;
    private HashMap<String,KeyInfo> keyList = new HashMap<>(10);

    /**
     * 私有构造子， 保证外界无法直接实例化
     */
    private KeyGenerator() {
    }

    /**
     * 静态工厂方法， 提供自己的实例
     */
    public static KeyGenerator getInstance() {
        return keygen;
    }

    /**
     * 取值方法， 提供下一个合适的键值
     */
    public synchronized int getNextKey(String keyName) {
        KeyInfo keyinfo;
        if (keyList.containsKey(keyName)) {
            keyinfo =  keyList.get(keyName);
            System.out.println("key found");
        } else {
            KeyInfo keyInfo = new KeyInfo(POOL_SIZE, keyName);
            keyinfo = keyInfo;
            keyList.put(keyName, keyinfo);
            System.out.println("new key created");
        }
        return keyinfo.getNextKey();
    }
}
