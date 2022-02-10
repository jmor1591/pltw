/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class RemoveDoubleSpace
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
        if (!(input.substring(i, i + 2).equals("  "))) {
          output += input.substring(i, i + 1);
        }
        else {
          i++;
        }
    }
    System.out.println(output);
  }
}