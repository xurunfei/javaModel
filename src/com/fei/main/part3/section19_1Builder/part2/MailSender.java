//package com.fei.main.part3.section19_1Builder.part2;
//
//import java.util.*;
//import java.io.*;
//import javax.mail.*;
//import javax.mail.intemet.*;
//import javax.activation.*;
///**
// * 退化的建造者模式,详情见
// * package com.javapattems.builder.javamail;
// * @author xurunfei
// * @Date: 2017/12/7 17:54
// * @See com.javapattems.builder.javamail
// */
//public class MailSender {
//    private static MimeMessage message;
//
//    public static void main(String[] args) {
//        //"你的 SMTP 服务器地址
//        String smtpHost = "smtp.mycompany,coni";
//        //发送者的地址
//        String from = "jeff.yan@mycompany.com";
//        //收信者的地址
//        String to = "ni.hao@youcompany.com";
//        Properties props = new Properties();
//        props.put("mail.smtp.host", smtpHost);
//        Session session = Session.getDefaultInstance(props, null);
//        try {
//            IntemetAddress[] address = {new InteraetAddress(to)};
//            // 创建 message 对象
//            message = new MimeMessage(session);
//            // 建造发件人位元址零件
//            message.setFrom(new IntemetAddress(from));
//            // 建造收件人位元址零件
//            message.setRecipients(Message.RecipientType.TO, address);
//            // 建造主题零件
//            message.setSubject("Hello from Jeff");
//            // 建造发送时间零件
//            message.setSentDate(new Date());
//            // 建造内容零件
//            message.setText("Hello，\nHow are things going ? ");
//            // 发送邮件， 相当于产品返还方法
//                    Transport.send(message);
//            System.out.primln("email has been sent.");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}