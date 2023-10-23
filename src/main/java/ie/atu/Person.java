package ie.atu;

import java.util.Scanner;
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Firstname: " + firstName + " Lastname: " + lastName + " Age: " + age);
    }

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter your age: ");
        this.age = scanner.nextInt();
    }
}

