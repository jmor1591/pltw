/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class DuplicateChars
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String input = sc.nextLine();
    sc.close();
    String output = "";
    
    /* Your Code Here */
    for (int i = 0; i < input.length(); i++) {
        String temp = input.substring(i, i + 1);
        int count = 0;
        if (temp.equalsIgnoreCase(input.substring(i + 1, i + 2))
        output += temp;
    }
    System.out.println(output);
  }
}