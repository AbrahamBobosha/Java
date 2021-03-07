/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOriented;

/**
 *
 * @author abli
 */
public class CylinderPrivate {

    // Properties
    private int radius;
    private int height;

    // Methods
    // Get
    public int getRadius() {
        return radius;
    }
    // Read

    public int getHeight() {
        return height;
    }
    
    public void setRadius(int r){
        
        if(r > 0)
          radius= r;
        else
            System.out.println("Insert new radius");
    }
    
    public void setHeight(int h){
        if(h > 0 )
            height = h;
        else
            System.out.println("Insert new height");
    }
    
    
    public double lidArea() {
        return 2 * Math.PI * radius * height;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + Circumference() * height;

    }

    public double volume() {

        return lidArea() * height;

    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }
    
    

}
class MainCylinder {

    public static void main(String[] args) {
        CylinderPrivate cp = new CylinderPrivate();
        cp.setHeight(10);
        cp.setRadius(5);
        System.out.println(cp.lidArea());
        
        System.out.format("lidArea : %.2f", cp.lidArea());
        System.out.println("");

        
    }
}
