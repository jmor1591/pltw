import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Rabbit");
        while (running) {
            System.out.println(animalList);
            System.out.println("Would you like to (a)dd. (i)nsert, (r)emove, Re(p)lace, or (q)uit?");
            String userInput = "";
            int position;
            String userAnimal;
            userInput = getInput();
            while (!(userInput.equals("a") || userInput.equals("i") || userInput.equals("r") || userInput.equals("p") || userInput.equals("q"))) {
                System.out.println("Invalid answer. Try again.");
                System.out.println("e");
                userInput = sc.nextLine();
            }
            if (userInput.equals("a")) {
                System.out.println("Enter an animal: ");
                userAnimal = sc.nextLine();
                animalList.add(userAnimal);
            }
            else if (userInput.equals("i")) {
                System.out.println("Enter an animal: ");
                userAnimal = sc.nextLine();
                System.out.println("Enter a postion: ");
                position = sc.nextInt();
                if (!(position-1 >= 0 && position-1 <= animalList.size()-1)) {
                    System.out.println("Bad Position!");
                }
                else {
                    animalList.add(position-1, userAnimal);
                }
            }
            else if (userInput.equals("r")) {
                System.out.println("Enter position: ");
                position = sc.nextInt();
                if (!(position-1 >= 0 && position-1 <= animalList.size()-1)) {
                    System.out.println("Bad Position!");
                }
                else {
                    animalList.remove(position-1);
                }
            }
            else if (userInput.equals("p")) {
                System.out.println("Enter an animal: ");
                userAnimal = getInput();
                System.out.println("Enter a position: ");
                position = sc.nextInt();
                if (!(position-1 >= 0 && position-1 <= animalList.size()-1)) {
                    System.out.println("Bad Position!");
                }
                else {
                    animalList.set(position-1, userAnimal);
                }
            }
            else if (userInput.equals("q")) {
                running = false;
            }
        }
    }

    private static String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}