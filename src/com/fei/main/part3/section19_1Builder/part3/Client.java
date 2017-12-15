package com.fei.main.part3.section19_1Builder.part3;

public class Client {
    private static Builder builder;
    private static Director director;

    static public void main(String[] args) {
        builder = new WelcomeBuilder();
        director = new Director(builder);
        director.construct("jeffyan77@yahoo.com",
                "javapattems@yahoo.com");
    }
}