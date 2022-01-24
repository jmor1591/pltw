/*
 * Activity 2.5.6
 */
public class Hike
{
  private String name;
  private double miles;
  private Hike favorite;

  /**
   * The constructor for the Hike class
   */
  public Hike(String n, double m)
  {
    name = n;
    miles = m;
    favorite = null;
  }
  
  /**
   * Gets the favorite hike
   * 
   * @return the favorite hike
   */ 
  public Hike getFavorite()
  {
    return favorite;
  }

  
  /**
   * Sets and print out the longer hike as the favorite hike
   * 
   * @param h The hike to compare hike lengths to
   */
  public void setFavorite(Hike h)
  {
    if (h.miles > miles)
    {
      favorite = h;
    }
    else {
      favorite = this;
    }
    System.out.println("Favorite hike is " + favorite);
  }

  /**
   * Two hikes are equal if they have the same name and are length 
   * 
   * @param h The hike to compare this hike to
   */
  public boolean equals(Hike h)
  {
    // check that s is defined
    if (h != null)
    {
      if (h.name.equals(name) && h.miles == miles)
      {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Return the name and length of the hike
   * 
   * @return The hike's name and lenght in miles
   */
  public String toString() 
  {
    return name + " (" + miles + " miles)";
  }

}