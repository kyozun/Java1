package Final;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Account extends AccountManager {


    @Override
    public void inputData() {
        this.inputCustomerCode();
        this.inputCustomerName();
        this.inputAccountNumber();
        this.inputAmount();

        System.out.println("Successfully added");


    }

    private void inputCustomerName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        this.setCustomerName(input.nextLine());
    }

    private void inputCustomerCode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer code: ");
        this.setCustomerCode(input.nextLine());
    }

    private void inputAccountNumber() {
        Scanner input = new Scanner(System.in);
        int inputNumber = 0;
        do {
            System.out.print("Enter account number: ");
            try {
                inputNumber = input.nextInt();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the account number");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, please enter account number again");
                input.next();
            }
        } while (inputNumber <= 0);
        this.setAccountNumber(inputNumber);

    }

    private void inputAmount() {
        Scanner input = new Scanner(System.in);
        long inputNumber = 0;
        do {
            System.out.print("Enter amount: ");
            try {
                inputNumber = input.nextLong();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the amount");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, please enter amount again");
                input.next();
            }
        } while (inputNumber <= 0);
        this.setAmount(inputNumber);
    }

    @Override
    public void displayData() {
        int length = 55;
        String line = String.format("%0" + length + "d", 0).replace('0', '-');
        System.out.println("+" + line + "+");
        System.out.printf("| %-4s | %-12s | %-14s | %-14s |%n", "Code", "Name", "Account Number", "Amount");
        System.out.println("+" + line + "+");
        System.out.printf("| %-4s | %-12s | %-14s | %-14s |%n", this.getCustomerCode(), this.getCustomerName(), this.getAccountNumber(), this.getAmount());
        System.out.println("+" + line + "+");
    }

    @Override
    public void depositAndWithdraw(long money, int type) {

    }


}
