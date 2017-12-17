package com.fei.main.part3.section20_1archetype.register;

public class Client {
     private PrototypeManager pm;
     private Prototype p;
     
     public void registerPrototype(Prototype prototype) throws CloneNotSupportedException{
         Prototype temp = (Prototype) prototype.clone();
         pm.add(temp);
     }
 }