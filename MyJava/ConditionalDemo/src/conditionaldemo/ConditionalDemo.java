/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionaldemo;

/**
 *
 * @author MyHp
 */
import java.util.*;

public class ConditionalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Find a number is odd or even
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 2 == 0)
        {
            System.out.println("The Given number is Even");
        }
        else
        {
            System.out.println("The Given number is Odd");
        }
        
        //Find person is young or not young
        String per = "Arul";
        int age = sc.nextInt();
        
        if( age < 20)
        {
            System.out.println("The person Mr." + per + " Young");
        }
        else
             System.out.println("The person Mr." + per + " Old");
        
        int m1,m2,m3;
        m1 = sc.nextInt();
        m2= sc.nextInt();
        m3 = sc.nextInt();
        
        int total = m1 + m2 + m3;
        float avg = total / 3;
        
        if(avg > 35)
        {
            if(avg > 60)
            {
                if(avg > 90)
                {
                    System.out.println("A+ Grade");
                }
                else
                {
                    System.out.println("A Grade");
                }
            }
            else
            {
                System.out.println("B Grade");
            }
        }
        else
        {
            System.out.println("D Grade");
        }
        
            //Leap Year
         System.out.println("Enter the year");
         int y = sc.nextInt();         
         if(y % 4 == 0)
         {
             if(y % 100 ==0)
             {
               if(y % 400 ==0)
             {
                 System.out.println(" The Given number is Leap year");
             }
             else
             {
                 System.out.println("The Given nuber is not Leap Year");
             }
             }
              else
             {
                 System.out.println("The Given nuber is not Leap Year");
             }
         }
         else
         {
             System.out.println("The Given number is not Leap Year");
         }
    

    }
    

    
   
}
