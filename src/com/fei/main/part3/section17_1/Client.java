package com.fei.main.part3.section17_1;

public class Client {
    private static Die diel, die2;

    public static void main(String[] args) {
        diel = Die.getlnstance(1);
        die2 = Die.getlnstance(2);
        diel.dice();
        die2.dice();
    }
}