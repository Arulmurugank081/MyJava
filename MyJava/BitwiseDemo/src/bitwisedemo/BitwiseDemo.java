/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwisedemo;

/**
 *
 * @author MyHp
 */
public class BitwiseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int x = 11, y =6, z;
//      
//        System.out.println(String.format("%s",Integer.toBinaryString(x)));
//        
//        y = x >>1;
//          System.out.println(String.format("%s",Integer.toBinaryString(y)));
//          
        byte a = 0;
        //set 3rd bit
        byte b = 0;
        System.out.println(String.format(Integer.toBinaryString(b)));
        a = (byte) (a|b);
        System.out.println(a);
        
        //check 3rd bit set or not
        byte c = (byte) (a & b);
        if( c > 0)
            System.out.println("3rd bit is set");
        //store Two number in single bit
        
        byte s = 0;
        System.out.println(String.format("%32s",Integer.toBinaryString(a)));
        
        a = 5;
           System.out.println(String.format("%32s",Integer.toBinaryString(a)));
           byte bb = 9;
              System.out.println(String.format("%32s",Integer.toBinaryString(bb)));
              a = (byte) (a | bb);
                 System.out.println(String.format("%32s",Integer.toBinaryString(a)));
                 bb = (byte)( bb << 4);
                    System.out.println(String.format("%s",Integer.toBinaryString(bb)));
                     a = (byte) (a | bb);
                 System.out.println(String.format("%32s",Integer.toBinaryString(a)));
        
                
       
        
    }
    
}
