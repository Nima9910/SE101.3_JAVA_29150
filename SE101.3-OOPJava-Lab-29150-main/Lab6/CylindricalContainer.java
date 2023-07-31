
package com.mycompany.labquestion1;

public class CylindricalContainer extends Container
{
    private double height, radius;
    
    public CylindricalContainer(double h, double r)
    {
        height=h;
        radius=r;
    }
    
    public double volume()
    {
        return (Math.PI * radius * radius * height);
    }
}
