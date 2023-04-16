package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Director extends Staff {
    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.setName(input.nextLine());

        int inputNumber = 0;
        do {
            System.out.print("Enter salary: ");
            try {
                inputNumber = input.nextInt();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the salary");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, please enter Salary again");
                input.next();
            }
        } while (inputNumber <= 0);
        this.setSalary(inputNumber);
    }

    public void displayData() {
        System.out.printf("| %-4s | %-12s | %-14s | %-14s |%n", this.getID(), "Director",  this.getName(), this.getSalary() + "$");
    }

    @Override
    public void editData() {
        this.inputData();
    }




}
