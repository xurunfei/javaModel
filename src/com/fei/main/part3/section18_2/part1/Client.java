package com.fei.main.part3.section18_2.part1;

public class Client {
    private static KeyGenerator keygen;

    public static void main(String[] args) {
        keygen = KeyGenerator.getlnstance();
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
    }
}