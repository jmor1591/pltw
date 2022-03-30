/*
 * Activity 4.9.2
 */
public class Feline extends Animal
{
  
    public Feline()
    {
    
    }
    
    public Feline(String food, boolean nocturnal, double aveLifeSpan) 
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A Feline arrives.");
    }

    public void hunt() {
        System.out.println("The feline hunts.");
    }
}