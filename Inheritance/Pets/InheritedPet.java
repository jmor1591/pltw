/*
 * Activity 4.9.1
 */
public class InheritedPet
{
  public static void main(String[] args)
  {
    System.out.println("my cat");
    Cat myCat = new Cat();
    myCat.setName("Romeo");
    myCat.purr();
    myCat.eat();
    myCat.sleep();
    
    System.out.println("my dog");
    Dog myDog = new Dog();
    myDog.setName("Juliette");
    myDog.walk();
    myDog.eat();
    myDog.sleep();

    System.out.println("my bird");
    Bird myBird = new Bird("Paco");
    myBird.setName("Not Paco");
    myBird.eat();
    myBird.sleep();
  }
}