/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nimantha
 */
public class RedLightThread extends Thread{
     public void run(){
         try {
             System.out.println("Red Light");
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
    }
}
