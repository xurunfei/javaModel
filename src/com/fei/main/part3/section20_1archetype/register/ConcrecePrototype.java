package com.fei.main.part3.section20_1archetype.register;

public class ConcrecePrototype implements Prototype{
      public synchronized Object clone() throws CloneNotSupportedException {
          Prototype temp = null;
          try {
             temp = (Prototype) super.clone();
          } catch (Exception e) {
              System.out.println("clone fail");
          }finally{
              return temp;
         }
     }
 }