/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("Lord of the Rings", "Tolkien");
    System.out.println(myBook);
    myLib.addBook(myBook);
  }
}