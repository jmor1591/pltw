public class Person {
    
    private String name;
    private int height;
    private int age;

    public Person(String n, int h, int a)
    {
        name = n;
        height = h;
        age = a;
    }

    public String toString() {
        return name;
    }
}
