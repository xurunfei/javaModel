package com.fei.main.part3.section19_1Builder.part4;

/**
 * 具体魔方的方法
 * @author xurunfei
 * @date 2017/12/15.
 */
public class ConcreteSpell extends Spell {
    @Override
    public void spellButtomCross() {
        magicCube.setCompleteDegree(20);
        magicCube.setCompleteSide(1);
    }

    @Override
    public void spellButtomSide() {
        magicCube.setCompleteSide(magicCube.getCompleteDegree()+20);
    }

    @Override
    public void spellPartOfAround() {
        magicCube.setCompleteSide(magicCube.getCompleteDegree()+20);

    }

    @Override
    public void spellTopSide() {
        magicCube.setCompleteSide(magicCube.getCompleteDegree()+20);
        magicCube.setCompleteSide(magicCube.getCompleteSide()+1);
    }

    @Override
    public void spellAllAround() {
        magicCube.setCompleteSide(magicCube.getCompleteDegree()+20);
        magicCube.setCompleteSide(magicCube.getCompleteSide()+4);
    }

    @Override
    public MagicCube complete() {
        return magicCube;
    }
}
