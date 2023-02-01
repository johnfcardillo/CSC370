/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlengthencode;
import java.util.Scanner;

/**
 *
 * @author johnc
 */
public class RunLengthEncode 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //String result;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter between 0 and 50 characters");
        
        String input = keyboard.nextLine();
        String value = encode(input);
        System.out.println(value);
        //System.out.println(result);
    }
    
    public static String encode(String in)
    {
        int len = in.length();
        String result = "";
        String twoDigit;
        
        for (int index = 0; index < len; index++)
        {
            int count = 1;
            while (index < len - 1 && in.charAt(index) == in.charAt(index + 1))
            {
                count++;
                index++;
            }
            
            if (count > 4)
            {
                twoDigit = String.format("%02d", count);
                result = result + "/" + twoDigit + in.charAt(index);
            }
            else
            {
                for (int k = 0; k < count; k++)
                {
                    result = result + in.charAt(index);
                }
            }
        }
        return result;
    }
}
