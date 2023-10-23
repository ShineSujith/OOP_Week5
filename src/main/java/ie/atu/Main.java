package ie.atu;
public class Main {
    public static void main(String[] args) {
        //objects created
        Person student1 = new Person("Shine", "Sujith", 19);
        Person student2 = new Person();

        //displays info of student 1
        student1.displayInfo();

        //user enters values
        student2.getUserInput();

        //displays user entered values
        student2.displayInfo();
    }
}