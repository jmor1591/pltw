import java.util.ArrayList;

public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
                    new Player("Bobbie", 18), new Player("Blaine", 20),
                    new Player("Chris", 15), new Player("Charlie", 15) };

    int sum = 0;
    double average = 0;
    int max = goals[0];
    int min = goals[0];
    int[] goalCounter = new int[10];

    for (int i = 0; i < goals.length; i++) {
      goalCounter[goals[i]]++;
      sum += goals[i];
    }

    average = (double) (sum) / goals.length;
    /*
    System.out.println("All goals: " + sum);
    System.out.println("Average amount of goals: " + average);
    System.out.println("Most amount of goals: " + max(goals));
    System.out.println("Least amount of goals: " + min(goals));
    for (int i = 0; i < goalCounter.length; i++) {
      System.out.println(i + " goals scored " + goalCounter[i] + " times.");
    }
    System.out.println("The mode is " + max(goalCounter) + " times.");
    */
    int index = 0;
    boolean hasValue = false;
    while (!hasValue && index < players.length) {
      if (players[index].getAge() >= 18) {
        hasValue = true;
      }
      index++;
    }

    if (hasValue) {
      System.out.println("There is a player that is 18 or older.");
    }
    else if (!hasValue) {
      System.out.println("No player is 18 or older.");
    }

    int index2 = 0;
    
  }

  private static int max(int[] list) {
    int max = list[0];
    for (int i = 0; i < list.length; i++) {
      if (list[i] > max) {
        max = list[i];
      }
    }
    return max;
  }

  private static int min(int[] list) {
    int min = list[0];
    for (int l : list) {
      if (l < min) {
        min = l;
      }
    }
    return min;
  }
}


/*
 * Activity 3.6.4
 */
class Player
{
  private String name;
  private int age;
  
  /* constructors */
  public Player()
  {
    this.name = "";
    this.age = 0;
  }
    
  public Player(String name)
  {
    this.name = name;
    this.age = 0;
  }
  
  public Player(String name, int age)
  {
    this.name = name;
    this.age = age;
  }
  
  /* accessors */
  public int getAge()
  {
    return age;
  }
    
  public String getName()
  {
    return name;
  }

  /* mutators */
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setPoints(int age)
  {
    this.age = age;
  }

}