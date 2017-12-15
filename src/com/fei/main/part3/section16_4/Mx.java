package com.fei.main.part3.section16_4;

import java.util.Hashtable;
import javax.naming.NamingEnumeration;//NamingEnameration
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.Attributes;
import javax.naming.directory.Attribute;
import javax.naming.NamingException;

/**
 * @author xurunfei
 * @date 2017/11/28.
 */
public class Mx {
    //todo xurnfei 无法运行
    public static void main(String[] args)
            throws NamingException {
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial",
                "com.sun.jndi.dns.DnsContextFactory");
        env.put("java.naming.provider.url", "dns://192.168.1.1");
// 创建环境对象
        DirContext dirContext = new
                InitialDirContext(env);
// 读取环境对象的属性
        Attributes attrs = dirContext.getAttributes(
                "192.168.1.1", new String[]{"MX"});
        for (NamingEnumeration ae = attrs.getAll();
             ae != null && ae.hasMoreElements(); ) {
            Attribute attr = (Attribute) ae.next();
            NamingEnumeration e = attr.getAll();
            while (e.hasMoreElements()) {
                String element = e.nextElement().toString();
                System.out.println(element);
            }
        }
    }
}