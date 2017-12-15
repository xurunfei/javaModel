package com.fei.main.part3.section19_1Builder.part3;


public class GoodbyeBuilder extends Builder {
    private static final String subject =
            "Thank you for being with us!";
    /**
     * 构 造 子
     */
    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    /**
     * 主题零件的建造方法
     */
    public void buildSubject() {
        msg.setSubject(subject);
    }

    /**
     * 内容零件的建造方法
     */
    public void buildBody() {
        String body = "Oops! You have chosen to leave.";
        msg.setBody(body);
    }

    /**
     * 邮件产品建造完成后， 发送邮件
     */
    public void sendMessage() {
        msg.send();
    }
}