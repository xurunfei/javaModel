package com.fei.main.part4.section22_adapter.objectAdapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    /**
     * 源类有方法 sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    /**
     * 源类没有方法 sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2() {
        // Write your code here
    }
}