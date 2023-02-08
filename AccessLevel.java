/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesslevel;
import java.util.Scanner;

/**
 *
 * @author johnc
 */
public class AccessLevel 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int rights[] = {};
        
        System.out.println("How many users would you like to check the access levels of?");
        int size = keyboard.nextInt();
        if (size >= 0 && size <= 50)
        {
            rights = new int[size];
        }
        else
        {
            System.out.println("Error: The number of users must be between 0 and 50");
        }
        
        System.out.println("\nWhat is the minimum permission a user needs for access?");
        int minPermission = keyboard.nextInt();
        if (minPermission < 0 || minPermission > 100)
        {
            System.out.println("Error: The minimum permission must be between 0 and 100");
        }
        System.out.println();
        
        String str = "";
        
        if (size == 0)
        {
            System.exit(0);
        }
        else
        {
           for (int index = 0; index < size; index++)
           {
               System.out.println("Enter the access level of user " + (index + 1) + ": ");

               rights[index] = keyboard.nextInt();

               if (rights[index] < 0 || rights[index] > 100)
               {
                   System.out.println("Error: The access level must be between 0 and 100");
               }

               if (rights[index] >= minPermission)
               {
                   str = str + "A";
               }
               else
               {
                   str = str + "D";
               }
           }
        }
       
        
        System.out.println("\nThe access report is: " + str);
                
    }
    
}
