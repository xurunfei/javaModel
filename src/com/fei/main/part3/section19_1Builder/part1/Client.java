package com.fei.main.part3.section19_1Builder.part1;

/**
 * @author xurunfei
 * @date 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.construct();
        System.out.println("得到产品"+product);
    }
}
