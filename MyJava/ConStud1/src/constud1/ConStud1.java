/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constud1;

/**
 *
 * @author MyHp
 */
import java.util.*;
public class ConStud1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Find name of the web sites and protocols
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String url = sc.nextLine();
        String pro = url.substring(0,url.indexOf(":"));
        if("http".equals(pro))
        {
            System.out.println("Hyper transfer protocol");
        }
        else
        {
            System.out.println("File Transfer Protocol");
        }
        
        String com = url.substring(url.lastIndexOf(".")+1,url.length());
        System.out.println(com);
        
        if(null != com)
        switch (com) {
            case "com" -> System.out.println("Commericial");
            case "org" -> System.out.println("Organization");
            case "gov" -> System.out.println("Government");
            default -> {
            }
        }
        
        
    }
    
}
