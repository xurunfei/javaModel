package com.fei.main.part3.section19_1Builder.part4;

/**
 * 导演者角色
 * @author xurunfei
 * @date 2017/12/15.
 */
public class People {
    private Spell spell;

    public People(Spell spell) {
        this.spell = spell;
    }

    /**
     * 拼魔方
     * @author xurunfei
     * @date 2017/12/15 16:54
     */
    public MagicCube spellMagicCube(){
        spell.spellButtomCross();
        spell.spellButtomSide();
        spell.spellPartOfAround();
        spell.spellTopSide();
        spell.spellAllAround();
        return spell.complete();
    }
}
