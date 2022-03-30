/*
 * Activity 4.9.4
 */
import java.lang.Math;

public abstract class LakeObject
{
  private int cost;
  private int weight;
  
  /*---------- constructor ----------*/
  public LakeObject()
  {
    // generate a random cost and weight for the LakeObject
    cost = (int) (Math.random() * 7) + 1;
    weight = (int) (Math.random() * 15 ) + 1;
  }

  /*---------- accessors ----------*/
  public int getCost()
  {
    return cost;
  }

  public int getWeight()
  {
    return weight;
  }

  /*---------- mutators ----------*/
  public void setCost(int cost)
  {
    this.cost = cost;
  }

  /*---------- additional methods ----------*/
  public String say()
  {
    return "You have collected a LakeObject!";
  }

  public String getObjectName()
  {
    // Object methods getClass().getName() return the name of  
    // the subclassed item, for example Fish or Bait
    return this.getClass().getName();
  }

}