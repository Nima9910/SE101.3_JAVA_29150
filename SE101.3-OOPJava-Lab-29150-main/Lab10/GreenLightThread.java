/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author Nimantha
 */
public class GreenLightThread {
      public void run(){
        try {
             System.out.println("Green Light");
             Thread.sleep(10000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
    }
}
