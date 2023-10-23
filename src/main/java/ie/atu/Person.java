package ie.atu;

import java.util.Scanner;
public class Person {
    //private variables
    private String firstName;
    private String lastName;
    private int age;

    //default constructor
    public Person(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    //constructor
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //displays student info
    public void displayInfo(){
        System.out.println("Firstname: " + firstName + " Lastname: " + lastName + " Age: " + age);
    }

    //gets user entered values
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

