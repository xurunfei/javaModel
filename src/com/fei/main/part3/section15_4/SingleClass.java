package com.fei.main.part3.section15_4;

import java.util.HashMap;

/**
 * 单例类饿汉试
 * @author xurunfei
 * @date 2017/12/6.
 */

public class SingleClass {
    private static SingleClass singleClass  = new SingleClass();
    private SingleClass(){}
    public static SingleClass getInstance(){
        return singleClass;
    }
}
/**
 * 懒汉式
 * @author xurunfei
 * @Date: 2017/12/6 11:44
 */
class LazySingleClass{
    private LazySingleClass lazySingleClass = null;
    private LazySingleClass(){}
    public LazySingleClass getInstance(){
        if(lazySingleClass == null){
            lazySingleClass = new LazySingleClass();
        }
        return lazySingleClass;
    }
}
/**
 * 多线程优化
 * @author xurunfei
 * @Date: 2017/12/6 11:47
 */
class MultiThreadSingle{
    private MultiThreadSingle multiThreadSingle = null;
    private MultiThreadSingle(){}
    public MultiThreadSingle getInstance(){
        synchronized(this){
            if (multiThreadSingle == null) {
                multiThreadSingle = new MultiThreadSingle();
            }
        }
        return multiThreadSingle;
    }
}
/**
 * 双重检查校验
 *  由于synchronized开销大,所以使用双重检查校验,这样只有开始初始化的时候有同步开销,以后就没有了
 * @author xurunfei
 * @Date: 2017/12/6 11:45
 */
class DoubleCheck{
    private DoubleCheck doubleCheck = null;
    private DoubleCheck(){}
    public DoubleCheck getInstance(){
        if (doubleCheck == null) {
            //只有开始初始化的时候会进入这里,初始化完毕后,doubleCheck不为null,所以直接返回
            synchronized (this) {
                if(doubleCheck == null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}

/**
 * 登记式单例类
 * 由于其他单例类都不能继承,登记式单例类实现了继承的功能
 * @author xurunfei
 * @Date: 2017/12/6 13:59
 */
class RegSingleton {
    private static HashMap<String, RegSingleton> regSingletonHashMap = new HashMap<>();
    static{
        RegSingleton regSingleton = new RegSingleton() ;
        regSingletonHashMap.put(regSingleton.getClass().getName(), regSingleton);
    }
    protected RegSingleton (){}
    public static RegSingleton getInstance(String name){
        if (name == null) {
            return regSingletonHashMap.get(RegSingleton.class.getName());
        }
        if (regSingletonHashMap.get(name) == null) {
            try {
                regSingletonHashMap.put(name, (RegSingleton) Class.forName(name).newInstance());
            } catch (Exception e) {
                System.out.println("Name error");
            }
        }
        return (RegSingleton) regSingletonHashMap.get(name);
    }
    public void about(){
        System.out.println("about RegSingleton");
    }
}

class RegSingletonChild extends RegSingleton{
    private RegSingletonChild(){}
    public RegSingletonChild getInstance(){
        return (RegSingletonChild) RegSingleton.getInstance(RegSingletonChild.class.getName());
    }
    public void about (){
        System.out.println("about RegSingleChild");
    }
}
