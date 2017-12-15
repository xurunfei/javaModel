package com.fei.main.part3.section19_1Builder.part3;

import java.util.Date;

abstract public class Builder {
    protected AutoMessage msg;

    /**
     * 构 造 子
     */
    public Builder() {
    }

    /**
     * 主题零件的建造方法
     */
    public abstract void buildSubject();

    /**
     * 内容零件的建造方法
     */
    public abstract void buildBody();

    /**
     * 发件人零件的建造方法
     */
    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    /**
     * 收件人零件的建造方法
     */
    public void buildTo(String to) {
        System.out.println(to);
        msg.setTo(to);
    }

    /**
     * 发送时间零件的建造方法
     */
    public void buildSendDate() {
        msg.setSendDate(new Date());
    }

    /**
     * 邮件产品完成后， 用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public void sendMessage() {
        msg.send();
    }
}