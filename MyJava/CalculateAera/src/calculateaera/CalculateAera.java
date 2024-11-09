/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculateaera;

/**
 *
 * @author MyHp
 */

import java.lang.*;
import java.util.*;
public class CalculateAera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base = 0;
        float height = 0;
        float aera = 0;
        
        System.out.println("Enter Base and height value for calcualte Area");
        
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        
        aera = 1/2 * base * height;
        
        System.out.println("Area of Triangle:" + aera);
    }
    
}
