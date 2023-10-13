/* Write a Program to take a user-defined input in which
1. All Upper Case letters should be shifted left by 2 characters
2.All Lower Case letters should be shifted left by 3 characters

Sample Input:
User gives input as "Hello"
Output should be: "Fbiil"	*/

import java.util.Scanner;

public class CharShift {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.next();
        String output = "";

        for (int i = 0; i < input.length(); i++) {  //iterates the input string
            if (Character.isUpperCase(input.charAt(i))) {   //check if uppercase
                output += (char) (input.charAt(i) - 2);  //character is decreased by 2 if its uppercase
            } else if (Character.isLowerCase(input.charAt(i))) {  //check if lowercase
                output += (char) (input.charAt(i) - 3);  //character is decreased by  3 if its lowercase
            }
        }

        System.out.println(output); //prints modified result
    }
}
