/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swapingtwonums;

/**
 *
 * @author MyHp
 */
public class SwapingTwoNums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a =10, b =20;
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a" + a);
        System.out.println("b:"+ b);
    }
    
}
