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

public class JavaDV { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle[] arr = new Circle[4];
        double epsilon = 1E-5;
        Point center1 = new Point(2,4);
        Point center2 = new Point(3,4);
        Point center3 = new Point(2,6);

        arr[0] = new Circle("Первый", 5, center1);
        arr[1] = new Circle("Второй", 2, center2);
        arr[2] = new Circle("Третий", 5, center3);
        arr[3] = new Circle("Четвертый", 5, center3);
        System.out.println(arr[0].isEqual(arr[2]));
        
        for(int i = 0; i < arr.length-1; ++i) {
            
            for(int j = i+1; j < arr.length; ++j) {
                
                if (arr[i].isEqual(arr[j])) {
                    System.out.format("Окружности %s и %s равны\n", arr[i].getName(), arr[j].getName());                
                }
                
                if (Math.abs((Math.PI * arr[i].getRadius()) - (Math.PI * arr[j].getRadius())) < epsilon){
                    System.out.format("Окружности %s и %s имеют одну площадь круга\n", arr[i].getName(), arr[j].getName());      
                }
                
                if (arr[i].isIntersect(arr[j])) {
                    
                    System.out.format("Окружности %s и %s пересекаются\n", arr[i].getName(), arr[j].getName());               
                }
                
            }
        }
    }
}
