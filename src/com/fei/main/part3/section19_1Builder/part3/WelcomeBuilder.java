package com.fei.main.part3.section19_1Builder.part3;

import java.util.Date;

public class WelcomeBuilder extends Builder {
    private static final String subject =
            "Welcome to philharmony news group!";

    /**
     * 构 造 子
     */
    public WelcomeBuilder() {
        msg = new AutoMessage();
    }

    /**
     * 主 题 零 件 的 建 造 方 法
     */
    public void buildSubject() {
        msg.setSubject(subject);
    }

    /**
     * 内 容 零 件 的 建 造 方 法
     */
    public void buildBody()

    {
        String body =
                "Congratulations for making the right choice!";
        msg.setBody(body);
    }

    /**
     * 邮 件 产 品 建 造 完 成 后， 发 送 邮 件
     * 此 方 法 相 当 于 产 品 返 还 方 法
     */
    public void sendMessage() {
        msg.send();
    }
}