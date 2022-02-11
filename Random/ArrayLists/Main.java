import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("J", 180, 17));
        list.add(new Person("L", 150, 18));
        list.add(new Person("C", 180, 17));
        System.out.println(list);
    }
}