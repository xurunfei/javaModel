package com.fei.main.part3.section19_1Builder.part4;

/**
 * 抽象建造方法
 * @author xurunfei
 * @date 2017/12/15.
 */
public abstract class Spell {

    protected MagicCube magicCube;
    /**
     * 拼成底部十字
     * @author xurunfei
     * @date 2017/12/15 16:30
     */
    public abstract void  spellButtomCross();

    /**
     * 拼成底部
     * @author xurunfei
     * @date 2017/12/15 16:31
     */
    public abstract void spellButtomSide();

    /**
     * 拼成部分四周的图形
     * @author xurunfei
     * @date 2017/12/15 16:32
     */
    public abstract void spellPartOfAround();
    
    /**
     * 拼成顶部
     * @author xurunfei
     * @date 2017/12/15 16:33
     */
    public abstract void spellTopSide();
    
    /**
     * 完成周围图形
     * @author xurunfei
     * @date 2017/12/15 16:38
     */
    public abstract void spellAllAround();

    /**
     * 完成产品
     * @author xurunfei
     * @date 2017/12/15 16:38
     */
    public abstract MagicCube complete();
}
