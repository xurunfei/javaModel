package com.fei.main.part3.section21_1serialization;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.TextField;

public class PickleMaker extends Frame {
    /**
     * 这个构造子创建一个 frame 视窗， 显示一个 TextField。
     */
    PickleMaker(String text, int size) {
        /*
        * ( 1 ) 调用超类的构造子
        * (2) 增加一个事件监听对象
        * ( 3) 将布局管理器改为 Flow 类型
        */
        super("Pickle Maker");
        addWindowListener(new win());
        setLayout(new FlowLayout());
        /*
        * 创建 TextField 对象并将它串行化
        */
        TextField textField = makeTextField(text, size);
        serializeTextField(textField, "mytextfield.ser");
        add(textField);
    }

    /**
     * 这个方法创建一个 TextField 对象， 以传进的 text 为文字内容，
     * 以传进的 size 为宽度
     */
    private TextField makeTextField(
            String text, int size) {
        TextField textField =
                new TextField(text, size);
        return textField;
    }

    /**
     * 将传进来的 TextField 对象串行化
     */
    private void serializeTextField(
            TextField textField, String filename) {
        try {
            FileOutputStream outStream =
                    new FileOutputStream(filename);
            ObjectOutputStream out =
                    new ObjectOutputStream(outStream);
            out.writeObject(textField);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 这个方法创建一个 frame 对象， 并显示一个 TextField
     */
    public static void main(String[] args) {
        Frame frame = new PickleMaker(
                "No matter where you go, &this.", 25);
        frame.setBounds(0, 0, 300, 200);
        frame.setVisible(true);
    }

    /**
     * 这个内部类提供了监听功能， 以便在接到操作系统传来
     * 的关闭窗口的事件时， 将应用程序结束掉
     */
    class win extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            Frame frame = (Frame) evt.getSource();
            frame.setVisible(false);
            frame.dispose();
            System.exit(0);
        }
    }
}