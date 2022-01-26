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
    input += " ";
    sc.close();
    String characters = "";
    String output = "";
    
    /* Your Code Here */
    for (int i = 0; i < input.length(); i++) {
      String temp = Character.toString(input.charAt(i));
      if (characters.contains(temp)) {
        characters += temp;
      }
      else if (characters.length() > 1 && !characters.contains(temp)) {
        output += characters;
        characters = temp;
      }
      else {
        characters = temp;
      }
    }
    System.out.println(output);
  }
}