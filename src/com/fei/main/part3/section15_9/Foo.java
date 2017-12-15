package com.fei.main.part3.section15_9;

// Broken multithreaded version
// "Double-Checked Locking” idiom
/**
 * 双重检查在java中不成立
 上面使用了双重检查成例的 “ 懒汉式” 单
 例类， 不能工作的基本原因在于， 在 Java 编译器中， LazySingleton 类的初始化与 mjnstance
 变量赋值的顺序不可预料。 如果一个线程在没有同步化的条件下读取 mjnstance 引用， 并
 调用这个对象的方法的话， 可能会发现对象的初始化过程尚未完成， 从而造成崩溃。
 * @author: xurunfei
 * @date: 2017/11/28 17:09
 */
class Foo {
    private Helper helper = null;
    public Helper getHelper() {
        if (helper == null) //第一次检查(位置 1 )
        {
//这里会有多于一个的线程同时到达（位置 2)
            synchronized (this) {
//这里在每个时刻只能有一个线程（位置 3)
                if (helper == null) //第二次检查（位置 4)
                {
                    helper = new Helper();
                }
            }
        }
        return helper;
    }
    //other functions and members...
}