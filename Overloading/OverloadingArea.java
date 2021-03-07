/*
 
overloading
    The method is the same 
    but the parameter is different
    the data type
    or the parameter is different

*/
package Overloading;

/**
 *
 * @author abli
 */
public class OverloadingArea {
 
    static double area(double base, double hieght)
    {
     return base * hieght;   
    }
     static double area(double radius)
    {
     return Math.PI * (radius * radius);   
    }
    
     static double area(double base1, double hieght, double base2)
    {
        return (base1*base2)*0.5;
    }
    
    
    
}
