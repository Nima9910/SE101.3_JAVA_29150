
package com.mycompany.prac01ex01;

public class IntefaceImplemented implements MyFirstInterface
{
    public void display()
    {
        //Trying to change the value
        /*If there were final, we can not chnage the value. 
        But if there is not final, we can change the value*/
        int y=20;
        
        System.out.println("The value of x is " +y);
    }
}
