package ie.atu;
public class Main {
    public static void main(String[] args) {
        Person student1 = new Person("Shine", "Sujith", 19);
        Person student2 = new Person();
        student1.displayInfo();
        student2.getUserInput();
    }
}