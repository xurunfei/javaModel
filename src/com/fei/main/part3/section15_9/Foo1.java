package com.fei.main.part3.section15_9;

class Foo1 {
    private Helper helper = null;

    public synchronized Helper getHelper() {
        if (helper == null) {
            helper = new Helper();
        }
        // other functions  and members...
        return helper;
    }
}