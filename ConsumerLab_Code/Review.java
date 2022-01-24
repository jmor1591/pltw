import java.util.Scanner;

import javax.management.ConstructorParameters;

import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

      /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
 
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static double totalSentiment(String fileName) {
    String sentString = textToString(fileName).toLowerCase();
    removePunctuation(sentString);
    String word = "";
    double total = 0;
    for (int i = 0; i < sentString.length(); i++) {
      String current = sentString.substring(i, i + 1);
      if (!(current.equals(" "))) {
        word += current;
      }
      else {
        total += sentimentVal(word);
        word = "";
      }
    }
    return total;
  }

  public static int starRating(String fileName) {
    double value = totalSentiment(fileName);
    if (value < 0) {
      return 1;
    }
    else if (value < 5) {
      return 2;
    }
    else if (value < 10) {
      return 3;
    }
    else {
      return 4;
    }
  }

  public static String fakeReview(String fileName)
  {
    //convert sample review to a string
    String originalReview = textToString(fileName).toLowerCase();
    //create a start and end point for grabbing adjectives (later)
    int start = 0;
    int end = 0;
    //basically indicating whether or not the program cares about detected words right now (to replace)
    boolean searching = false;

    //iterates through every character of the original (sample) review
    for (int i = 0; i < originalReview.length(); i++) {
      //current is the current character that is being inspected
      String current = originalReview.substring(i, i + 1);
      //if current is an * which is the indication of an adjective
      if (current.equals("*")) {
        //start is remembering that this is the location of the adjective in the string
        start = i;
        //end is initialized as 1 after start in case start and end need to be used in a substring method
        end = i + 1;
        //indicates to the program that it "should"/will be recording the valid characters it finds
        searching = true;
      }
      
      //this code executes if the program is searching for letters and finds one
      else if (Character.isAlphabetic(originalReview.charAt(i)) && searching == true) {
        //System.out.println(current + " " + i);
        //moves the end to include this newfound letter
        end = i + 1;
      }

      //if the program detects and end to the adjective then it will execute this code
      else if ((current.equals(" ") || !Character.isAlphabetic(originalReview.charAt(i))) && searching == true) {
        //i is changed back to before everything is about to be changed (the length of the review is about to change)
        i = start;

        // if the sentiment value of the sentence is positive, positive adjectives will be used.
        if (sentimentVal(current) >= 0) {
          /* change original review to everything before the adjective (excluding the *) + a random adjective (depending)
             + the rest of the review. 
          */
          originalReview = originalReview.substring(0, start) + randomPositiveAdj() + originalReview.substring(end, originalReview.length());
        }

        //same as above but with a negative adjective
        else {
          originalReview = originalReview.substring(0, start) + randomNegativeAdj() + originalReview.substring(end, originalReview.length());
        }
        //start is set back to the beginning of the review
        start = 0;
        //end is set to the end of the review
        end = originalReview.length();
        //indicate that the program is no longer searching/replacing an adjective as of now.
        searching = false;
      }
    }
    //return the new review
    return originalReview;
  }
  //Main Method
  public static void main(String[] args)
{
  //System.out.println(textToString("SimpleReview.txt"));
  //System.out.println(totalSentiment("SimpleReview.txt"));
  //System.out.println(starRating("SimpleReview.txt"));
  System.out.println(fakeReview("SimpleReview.txt"));
}
}