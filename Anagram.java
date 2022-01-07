/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class Anagram
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String input1 = sc.nextLine();
    System.out.println("Enter another String: ");
    String input2 = sc.nextLine();
    sc.close();
    
    /* Your Code Here */
    if (input1.length() == input2.length()) {
        for (int i = 0; i < input1.length(); i++) {
            char temp = input1.charAt(i);
            int index = input2.indexOf(temp);
            // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the
            // String
            if (index != -1) {
                input2 = input2.substring(0, index) + input2.substring(index + 1, input2.length());
            }
            else {
                System.out.println(input1 + " and " + input2 + " are NOT anagrams of each other.");
                i = input1.length();
            }
        }
        if (input2.isEmpty()) {
            System.out.println(input1 + " and " + input2 + " ARE anagrams of each other.");
        }
}
else {
    System.out.println(input1 + " and " + input2 + " are NOT anagrams of each other.");
}
  }
}