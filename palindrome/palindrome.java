package palindrome;

import java.util.Scanner;
/*This a program that takes a string as input and checks if it is a palindrome.
 A palindrome is a word, number, or other sequence of characters that reads
  the same forward and backward. */

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Word : ");
        String name = input.nextLine();
        // StringBuilder to create a new string that is a reverse of the input string.
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        if (str.equals(name)) {// the equals() method to check if the input string and the reversed string are the same.
            System.out.println("Word is a Palindrome");
        } else {
            System.out.println("Word is not a Palindrome");
        }
        input.close();
    }
}
