/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    Tiger tiger = new Tiger();
    tiger.swim();
    tiger.hunt();
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    Gorilla gorilla = new Gorilla();
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    Hippo hippo = new Hippo();
    hippo.eat();
  }
}