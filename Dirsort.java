/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dirsort;
import java.util.Scanner;
/**
 *
 * @author johnc
 */

public class Dirsort 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many directories would you like to sort through?");
        int size = keyboard.nextInt();
        
        while (size < 1 || size > 50)
        {
            System.out.println("Error: The size must be between 1 and 50");
            System.out.println("How many directories would you like to sort through?");
            size = keyboard.nextInt();
        }
        
        int countSlash = 0;
        String str1 = "", str2 = "", str3 = "", str4 = "", str5 = "";
        String dirs[] = new String[size];
        System.out.println("Enter your directories: ");
        
        for (int index = 0; index < dirs.length; index++)
        {
            dirs[index] = scan.nextLine();
            countSlash = 0;
            
            for (int i = 0; i < dirs[index].length(); i++)
            {
                if (dirs[index].charAt(i) == '/')
                {
                    countSlash++;
                }
            }
            
            if (countSlash == 1)
            {
                str1 = str1 + dirs[index] + ", ";
            }
            else if (countSlash == 2)
            {
                str2 = str2 + dirs[index] + ", ";
            }
            else if (countSlash == 3)
            {
                str3 = str3 + dirs[index] + ", ";
            }
            else if (countSlash == 4)
            {
                str4 = str4 + dirs[index] + ", ";
            }
            else if (countSlash == 5)
            {
                str5 = str5 + dirs[index] + ", ";
            }
        }
        
        String str = str1 + str2 + str3 + str4 + str5;
        String output = str.substring(0, str.length() - 2);
        System.out.println(output);
    }
    
}
