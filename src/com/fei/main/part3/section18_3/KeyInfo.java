package com.fei.main.part3.section18_3;

class KeyInfo {
    private int keyMax;
    private int keyMin;
    private int nextKey;
    private int poolSize;
    private String keyName;

    /**
     * 构 造 子
     */
    public KeyInfo(int poolSize, String keyName) {
        this.poolSize = poolSize;
        this.keyName = keyName;
        retrieveFromDB();
    }

    /**
     * 取值方法， 提供键的最大值
     */
    public int getKeyMax() {
        return keyMax;
    }

    /**
     * 取值方法， 提供键的最小值
     */
    public int getKeyMin() {
        return keyMin;
    }

    /**
     * 取值方法， 提供键的当前值
     */
    public int getNextKey() {
        if (nextKey > keyMax) {
            retrieveFromDB();
        }
        return nextKey++;
    }

    /**
     * 内部方法， 从数据库提取键的当前值
     */
    private void retrieveFromDB() {
        String sqll = "UPdate KeyTable SET keyValue = keyValue + "
                + poolSize + " WHERE keyName ="
                + keyName + "'";
        String sql2 = "SELECT keyValue FROM KeyTable WHERE KeyName ="
                + keyName + "'";
// execute the above queries in a transaction and commit it
// assume the value returned is 1000
        int keyFromDB = 1000;
        keyMax = keyFromDB;
        keyMin = keyFromDB - poolSize + 1;
        nextKey = keyMin;
    }
}