/* 
 * Activity 1.1.3
 */
public class GalaxyWeight
{
  public static void main(String[] args)
  {
    // declare and initialize weightOnEarth, earthGravity, and jupiterGravity 
    int weightOnEarth = 177;
    double earthGravity = 9.81;
    double jupiterGravity = 24.79;
    double mercuryGravity = 3.59;
    double marsGravity = 3.711;
    
    // calculate weigth
    double weightOnJupiter = weightOnEarth * jupiterGravity / earthGravity;
    double weightOnMercury = weightOnEarth * mercuryGravity / earthGravity;
    double weightOnMars = weightOnEarth * marsGravity / earthGravity;
    System.out.print((weightOnJupiter+weightOnMercury+weightOnMars)/3);
  }
}
