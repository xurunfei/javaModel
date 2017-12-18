package com.fei.main.part3.section20_1archetype.common;

public class Client {
    private Prototype prototype;

    public void operation(Prototype example) throws CloneNotSupportedException {
        Prototype p = (Prototype) example.clone();
    }
}