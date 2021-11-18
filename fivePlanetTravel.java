/* 
 * Activity 1.1.5
 */
public class fivePlanetTravel
{
  public static void main(String[] args)
  {
    // theplanets.org average distance from earth to the planets
    int mercury = 56974146;
    int venus = 25724767;
    int mars = 48678219;
    int jupiter = 390674710;
    int saturn = 792248270;

    // number of planets to visit
    int numPlanets = 5;

    // speed of light and our speed
    int lightSpeed =  670616629;
    lightSpeed /= 10;

    // total travel time
    double total = 0;

    /* your code here */
    total = ((double) mercury + venus + mars + jupiter + saturn);
    int average = (int) (total / numPlanets / lightSpeed + .5);
    System.out.println("Average travel time: " + average + " hours");
  }
}
