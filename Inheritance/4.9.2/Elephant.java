/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
        {
            super(food, nocturnal, aveLifeSpan);
            System.out.println("The elephant has arrived.");
        }
  public void trumpet()
  {
    System.out.println("The elephant trumpets.");
  }
}