package com.fei.main.part3.section16_4;
/**
 * smtp服务器信息
 * @author xurunfei
 * @date: 2017/11/29 10:35
 */
public class MailServer {
    private int priority;
    private String server;

    /**
     * 优先权的赋值方法
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * 服务器名的赋值方法
     */
    public void setServer(String server) {
        this.server = server;
    }

    /**
     * 优先权的取值方法
     */
    public int getPriority() {
        return priority;
    }

    /**
     * 服务器名的取值方法
     */
    public String getServer() {
        return server;
    }
}