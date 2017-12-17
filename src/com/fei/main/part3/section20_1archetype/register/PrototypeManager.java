package com.fei.main.part3.section20_1archetype.register;

import java.util.Vector;

public class PrototypeManager {
      private Vector vector = new Vector();
      
      public void add(Prototype e){
          vector.add(e);
      }
      
      public Prototype get(int i){
          return (Prototype) vector.get(i);
     }
}