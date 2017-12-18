package com.fei.main.part3.section20_1archetype.common;

public class ConcrecePrototype implements Prototype{
     public Object clone() throws CloneNotSupportedException {
         try {
             return super.clone();
         } catch (Exception e) {
             return null;
         }
      }
 }