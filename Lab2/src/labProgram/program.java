/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labProgram;

import java.util.Arrays;

/**
 *
 * @author nayankarumuri
 */
public class program {
    
    public static void main(String [] args){
        int[] p = {1, 2, 3, 4, 5};
    
    int l= p.length;
    
    for (int i = 0; i < l; i++) {
        if(l%2==0){
            p[i]*=2;
        }else {
        p[i] *= 3;

        } 
    }
    
    System.out.println("transformed array: " + Arrays.toString(p));
    
    
    }
}
