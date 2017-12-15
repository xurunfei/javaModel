package com.fei.main.part3.section15_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
       String path =  ClassLoader.getSystemClassLoader().getResource("").getPath();
        System.out.println(path);
    }

    /**
     * 测试单例例子
     * @author: xurunfei
     * @date: 2017/11/28 14:24
     */
    public void testConfigManager(){

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Type quit to quit");
        do {

            System.out.print("Property item to read:");
            try {
                String line = reader.readLine();
                if (line.equals("quit")) {
                    break;
                }
                ConfigManager configManager = ConfigManager.getInstance();
                System.out.println(configManager
                        .getConfigItem(line, "Not found."));
            }catch (Exception e){
                e.printStackTrace();
            }
        } while (true);
    }
    /**
     * 其他单例例子
     * @author: xurunfei
     * @date: 2017/11/28 14:23
     */
    public void otherSingleExccemple(){
        try {
            //打开一个程序
//            Process proc = Runtime.getRuntime().exec("c:\\Program Files (x86)\\Notepad++\\notepad++.exe");
            //打开一个文件
            Process proc = Runtime.getRuntime().exec("cmd /E:ON /c start d:\\fei\\需要转移的东西\\Java面试宝典2017.doc");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
