/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadv;

/**
 *
 * @author prevision
 */
public class Circle {
    
    private String name;
    private double radius;
    private Point center;
    double epsilon = 1E-5;
    
    public Circle() {
        
        name = "Empty";
        radius = 0;
        
    }
    
    public Circle(String newName, double newRadius, Point newCenter) {
        
        name = newName;
        radius = newRadius;
        center = newCenter;
        
    }
    
    public String getName() {
        
        return this.name;
        
    }
    
    public double getRadius() {
        
        return this.radius;
        
    }
    public boolean isEqual(Circle obj) {
        
        if (Math.abs(this.radius - obj.radius) < epsilon) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean isEqualOnPlane(Circle obj) {
        
        if (this.center.isEqual(obj.center)) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean isIntersect(Circle obj) {
       
        double distance = this.center.distanceTo(obj.center);
        
        if (distance >= Math.pow(this.radius - obj.radius, 2)) {
            return distance < this.radius + obj.radius;
        }
        else {
            return false;
        }
    }
    
}
