package com.fei.main.part3.section19_1Builder.part4;

/**
 * @author xurunfei
 * @date 2017/12/15.
 */
public class Client {
    public static void main(String[] args) {
        Spell spell = new ConcreteSpell();//拼魔方公式
        People people = new People(spell);//拼魔方的人
        MagicCube magicCube = people.spellMagicCube();//开始拼魔方,得到完整的魔方
    }
}
