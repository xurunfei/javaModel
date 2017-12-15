package com.fei.main.part3.section18_2.part3;
/**
 * 序列键生成器,(预留20个键值)
 *
 * @author xurunfei
 * @date: 2017/12/1 10:33
 */
public class KeyGenerator {
    private static KeyGenerator keygen =
            new KeyGenerator();
    private static final int POOL_SIZE = 20;
    private KeyInfo key;

    /**
     * 私有构造子， 保证外界无法直接实例化
     */
    private KeyGenerator() {
        key = new KeyInfo(POOL_SIZE);
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
    public synchronized int getNextKey()
    {
        return key.getNextKey();
    }
}