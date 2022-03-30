/*
 * Activity 4.9.2
 */
public class Tiger extends Feline
{
  
    public Tiger() 
    {

    }
    
    public Tiger(String food, boolean nocturnal, double aveLifeSpan) 
    {
        super(food, nocturnal, aveLifeSpan);
    }
    
    public void swim() {
        System.out.println("The tiger swims.");
    }

    public void hunt() {
        System.out.println("The tiger hunts alone.");
    }
}