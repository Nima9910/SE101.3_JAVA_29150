
package com.mycompany.labquestion02;

public class Rectangle implements Shape
{
    private double width, height;
    public Rectangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    
    public void setWidth(double w)
    {
        width=w;
    }
    public double getWidth()
    {
        return width;
    }
    
    public void setHeight(double h)
    {
        height=h;
    }
    public double getHeight()
    {
        return height;
    }
    
    public double CalculateArea()
    {
        return width * height;
    }
    public double CalculatePerimeter()
    {
        return ((width*2) + (height*2));
    }
}
