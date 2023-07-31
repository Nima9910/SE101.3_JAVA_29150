
package com.mycompany.labquestion02;

public class LabQuestion02
{

    public static void main(String[] args)
    {
        Circle c1=new Circle(20);
        System.out.println("Circle Area is "+c1.CalculateArea());
        System.out.println("Circle Perimeter is "+c1.CalculatePerimeter());
                
        System.out.println("");
        
        Rectangle r1=new Rectangle(10,20);
        System.out.println("Rectangle Area is "+r1.CalculateArea());
        System.out.println("Rectangle Perimeter is "+r1.CalculatePerimeter());
        
        System.out.println("");
        
        Triangle t1=new Triangle(10,8,20,10);
        System.out.println("Triangle Area is "+t1.CalculateArea());
        System.out.println("Triangle Perimeter is "+t1.CalculatePerimeter());
    }
}
