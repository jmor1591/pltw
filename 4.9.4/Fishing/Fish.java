/*
 * Activity 4.9.4
 */
public class Fish extends LakeObject
{

  public int getCost() {
    return super.getWeight() * super.getCost();
  }
}