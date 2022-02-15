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
            String userInput = sc.nextLine();
            while (!(userInput.equals("a") || userInput.equals("i") || userInput.equals("r") || userInput.equals("p") || userInput.equals("q"))) {
                System.out.println("Invalid answer. Try again");
                userInput = sc.nextLine();
            }
            if (userInput.equals("a")) {
                System.out.println("Enter an animal: ");
                userInput = sc.nextLine();
                animalList.add(userInput);
            }
            else if (userInput.equals("i")) {
                System.out.println("Enter an animal: ");
                userInput = sc.nextLine();
                System.out.println("Enter a postion: ");
                int position = sc.nextInt();
                if (!(position-1 >= 0 && position-1 <= animalList.size()-1)) {
                    System.out.println("Bad Position");
                }
                else {
                    animalList.add(position-1, userInput);
                }
            }

        }
    }
}