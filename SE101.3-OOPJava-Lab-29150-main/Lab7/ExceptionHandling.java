
package com.mycompany.exceptionhandling;
import java.util.Scanner;

public class ExceptionHandling 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try
        {
             int no1, no2, ans;
        System.out.println("Enter First Number: ");
        no1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        no2=sc.nextInt();
         ans=no1/no2;
         System.out.println("Answer is: "+ans);
        }
     
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Division is zero is not allowed"+e);
        }
       
    }
}
