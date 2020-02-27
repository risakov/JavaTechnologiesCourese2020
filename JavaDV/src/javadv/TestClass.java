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
public class TestClass {
    
    private int[] array;
    private int size;
    
    public TestClass() {
        size = 10;
        array = new int[size];
        for(int i = 0; i < 10; ++i) {
            array[i] = i;
        }
        
    }
    
    public TestClass(int size, int[] array1) {
        this.size = size;
        for(int i = 0; i < size; ++i) {
            array[i] = array1[i];
        }
        
    }
    
    @Override
    public String toString() {
        
        String a = "Size of array = " + array.length + "\n";
        for(int i = 0; i < array.length; ++i) {
            a += + array[i] + " ";
        }
        
        return a;

    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Для отладки");
    }
}
