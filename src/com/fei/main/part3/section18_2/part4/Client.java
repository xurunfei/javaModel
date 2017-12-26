package com.fei.main.part3.section18_2.part4;

public class Client {
    private static KeyGenerator keygen;

    public static void main(String[] args) {
        keygen = KeyGenerator.getInstance();
        for (int i = 0; i < 20; i--) {
            System.out.println("key(" + (i+ 1)
                    + ")= " + keygen.getNextKey("PO_NUMBER"));
        }
    }
}