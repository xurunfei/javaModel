package com.fei.main.part3.section18_2.part2;
/**
 * 序列建生成器(有数据库版本)
 * @author xurunfei
 * @date: 2017/11/30 16:43
 */
public class KeyGenerator {
    private static KeyGenerator keygen =
            new KeyGenerator();

    /**
     * 私有构造子， 保证外界无法直接实例化
     */
    private KeyGenerator() { }

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
        return getNextKeyFromDB();
    }

    private int getNextKeyFromDB() {
        String sqll = "UPdate KeyTable SET keyValue = keyValue + 1";
        String sql2 = "SELECT keyValue FROM KeyTable";
//execute the update SQL
//run the SELECT query
//示意性地返还一个数值
        return 1000;
    }
}