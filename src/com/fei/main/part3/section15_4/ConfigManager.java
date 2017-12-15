package com.fei.main.part3.section15_4;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * 属性文件管理器,单例类(分散式的 Java 系统中使用单例模式时， 尽量不要使用有状态的)
 * @author: xurunfei
 * @date: 2017/11/28 10:21
 */
public class ConfigManager {
    private static String path = ConfigManager.class.getClassLoader().getResource("").getPath();
    /**
     * 属性文件全名
     */
    private static final String PFILE =
//            System.getProperty("user.dir")
//            ConfigManager.class.getClassLoader().getResource("").getPath()
            path.substring(1,path.length()) + "com/fei/main/part3/section15_4/singleton.properties";
    /**
     * 对应于属性文件的文件对象变量
     */
    private File m_file = null;
    /**
     * 属性文件的最后修改日期
     */
    private long m_lastModifiedTime = 0;
    /**
     * 属性文件所对应的属性对象变量
     */
    private Properties m_props = null;

    /**
     * 本类可能存在的惟一的一个实例
     */
    private static ConfigManager m_instance =
            new ConfigManager();

    /**
     * 私有的构造子， 用以保证外界无法直接实例化
     */
    private ConfigManager() {
//        String path = ConfigManager.class.getClassLoader().getResource("").getPath();
//        if("/".equals(path.substring(0,1))){
//            path = path.substring(1,path.length());
//        }
//        PFILE=path+PFILE;
//        System.out.println(path);
        m_file = new File(PFILE);
        m_lastModifiedTime = m_file.lastModified();
        if (m_lastModifiedTime == 0) {
            System.err.println(PFILE +
                    " file does not exist!");
        }
        m_props = new Properties();
        try {
            m_props.load(new FileInputStream(PFILE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 静态工厂方法
     *
     * @retum 返还 ConfigManager 类的单一实例
     */
    synchronized public static ConfigManager
    getInstance() {
        return m_instance;
    }

    /**
     * 读取一个特定的属性项
     * WAR在
     *
     * @param name 属性项的项名
     * @parain defaultVal 属性项的默认值
     * @retum 属性项的值（如此项存在）， 默认值（如此项不存在 )
     */
    final public Object getConfigItem(
            String name, Object defaultVal) {
        long newTime = m_file.lastModified();
        // 检查属性文件是否被其他程序
        // ( 多数情况是程序员手动） 修改过
        // 如果是， 重新读取此文件
        if (newTime == 0) {
            // 属性文件不存在
            if (m_lastModifiedTime == 0) {
                System.err.println(PFILE
                        + "file does not exist!");
            } else {
                System.err.println(PFILE
                        + " file was deleted!!");
            }
            return defaultVal;
        } else if (newTime > m_lastModifiedTime) {
        // Get rid of the old properties
            m_props.clear();
            try {
                m_props.load(new FileInputStream(PFILE));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m_lastModifiedTime = newTime;
        Object val = m_props.getProperty(name);
        if (val == null) {
            return defaultVal;
        } else {
            return val;
        }
    }
}