public class Bird extends Pet {
    
    private int wingSpan;

    
    public Bird(String name) {
        setName(name);
    }

    public Bird(String name, int wingSpan) {
        setName(name);
        this.wingSpan = wingSpan;
    }

    public String toString() {
        return "Name: " + getName() + "\n Wingspan: " + wingSpan;
    }
}
