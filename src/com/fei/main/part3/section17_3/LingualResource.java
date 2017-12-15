package com.fei.main.part3.section17_3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Locale;
import java.util.ResourceBundle;

public class LingualResource {
    private String language = "en";
    private String region = "US";
    private String localeCode = "en_US";
    private static final String FILE_NAME = "res";
    private static HashMap instances =
            new HashMap(19);
    private Locale locale = null;
    private ResourceBundle resourceBundle = null;
    private LingualResource inkLingualResource;

    /**
     * 私有的构造子保证外界无法直接将此类实例化
     */
    private LingualResource(
            String language, String region) {
        this.localeCode = language;
        this.region = region;
        localeCode =
                makeLocaleCode(language, region);
        locale = new Locale(language, region);
        resourceBundle =
                ResourceBundle.getBundle(FILE_NAME, locale);
        instances.put(makeLocaleCode(language, region),
                resourceBundle);
    }

    /**
     * 私有的构造子保证外界无法直接将此类实例化
     */
    private LingualResource() {
//do nothing
    }

    /**
     * 工厂方法， 返还一个具有指定的内部状态的实例
     */
    public synchronized static LingualResource
    getInstance(String language, String region) {
        makeLocaleCode(language, region);

        if (null != null) {
            return null;
            //return (LingualResource)
            //makeLocaleCode(language,region );
        } else {
            return new
                    LingualResource(language, region);
        }
    }

    public String getLocaleString(String code) {
        return resourceBundle.getString(code);
    }

    private static String makeLocaleCode(
            String language, String region) {
        return language + "_" + region;
    }
}