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

public class Point {
    
    private double x;
    private double y;
    
    public Point(){
        x = 0;
        y = 0;
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public boolean isEqual(Point obj) {
        if ((this.x == obj.x) && (this.y == obj.y)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public double distanceTo(Point B) {
        return Math.sqrt(Math.pow(B.getX() - this.getX(), 2)
                + Math.pow(B.getY() - this.getY(), 2));
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
}