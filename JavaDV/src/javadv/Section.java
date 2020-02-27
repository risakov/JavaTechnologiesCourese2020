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
public class Section {
    
    private Point begin;
    private Point end;
    private String name;
    
    public Section() {
        
        this.begin = new Point(0,0);
        this.end = new Point(0,0);
        
    }
    
    public Section(Point newBegin, Point newEnd) {
        
        this.begin = newBegin;
        this.end = newEnd;
        
    }
    
    public Point getBegin() {
        return this.begin;
    }
    
    public Point getEnd() {
        return this.end;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double length() {
        return this.begin.distanceTo(this.end);
    }
    
    public Boolean commonPoint(Section obj) {
        return (this.begin.isEqual(obj.begin)) || (this.end.isEqual(obj.end));
    }
    
    public Boolean isEqualLength(Section obj) {
        
        double epsilon = 1E-5;
        return (Math.abs(this.length() - obj.length()) < epsilon) ;
        
    }
    
    public Boolean isMatch(Section obj) {
        
        return (this.begin.isEqual(obj.begin) && this.end.isEqual(obj.end));
        
    }
    
}
