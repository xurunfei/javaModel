package com.fei.main.part4.section22_adapter.classAdapter;

public class Adapter extends Adaptee implements Target {
    /**
     * 由于源类没有方法 sampleOperation2,
     * 因此适配器类补充上这个方法
     */
    public void sampleOperation2() {
        // Write your code here
    }
}