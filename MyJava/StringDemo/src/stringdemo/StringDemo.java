/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringdemo;

/**
 *
 * @author MyHp
 */
public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Java Progam";
        System.out.println(str1);
        
        String str2 = new String ("JAVA");
        System.out.println(str2);
        
        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c,1,3);
        System.out.println(str3);
        
        String s1 = "a";
        String s2 =  new String("Java");//Java Program";
        System.out.println(s1 == s2);
        
        //Method
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase()); // it will not change the origianl litral
        System.out.println(s1);
        System.out.println(s2.trim());
        System.out.println(s1.indexOf('J'));
        int a;
                System.out.println(s1.matches("[a-z]"));
                System.out.println(s2.indexOf('v'));
                
        //Find user id from mail id and domain name and check the domain name is valid or not
        String mail = "Programmer@gmail.com";
        int pos = mail.indexOf('@');
        String id = mail.substring(0, pos);
        System.out.println(id);
        int pos1 = mail.lastIndexOf('.');
        String domain = mail.substring(pos+1, pos1);
        System.out.println(domain);
        System.out.println(domain.equals("gmail"));
        
        //Find if number is binary or not, Hexa or not, date format dd/mm/yyyy
        int binary = 1011010;
        String bStr = String.valueOf(binary);
        System.out.println(bStr);
        
        System.out.println("Is the given number is binary: (True/ False)" + bStr.matches("[0-1]+")); // * mean more than one, + means atleast one
        
        String xa = "1ccafG";
        System.out.println("Is the given number is XA:" + xa.matches("[0-9A-Fa-f]*"));
        
        String date = "20/05/1981";
        System.out.println("Is give number is Date?" + date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        
        //Remove Special char from string
        String sp = "J#ava% Program$((((   Arul";
        
        sp = sp.replaceAll("[!@#$%^&*()]", "");
         System.out.println(sp);
        
        //Remove Extra space from string
        String es = "J  Ava  Programmm";
        es = es.replaceAll("\\s+", " "); // removing extra space useing \\s+
        
        System.out.println(es);
        
        String words = "Java";
        words = words.replaceAll("\\s+", " ").trim();
       String w[] =  words.split("\\s");
       System.out.println(words.length());
        
        
    }
    
}
