package Final;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountManager {
    private final List<Account> accountLists = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void inputData() {
        String customerCode = this.inputCustomerCode();
        String customerName = this.inputCustomerName();
        int accountNumber = this.inputAccountNumber();
        long amount = 0;

        Account account = new Account(customerCode, customerName, accountNumber, amount);
        accountLists.add(account);
        System.out.println("Successfully added");
    }

    public void displayData() {
        int length = 69;
        String line = String.format("%0" + length + "d", 0).replace('0', '-');
        System.out.println("+" + line + "+");
        System.out.printf("| %-8s | %-16s | %-20s | %-14s |%n", "Code", "Name", "Account Number", "Amount");
        System.out.println("+" + line + "+");
        for (Account accountList : accountLists) {
            System.out.printf("| %-8s | %-16s | %-20s | %-14s |%n", accountList.getCustomerCode(), accountList.getCustomerName(), accountList.getAccountNumber(), accountList.getAmount());
        }
        System.out.println("+" + line + "+");
    }

    public void depositAndWithdraw(long money, int type) {

    }

    private String inputCustomerName() {
        System.out.print("Enter customer name: ");
        return input.nextLine();

    }

    private String inputCustomerCode() {
        String inputCustomer;
        boolean inputSucess = false;
        do {
            System.out.print("Enter customer code: ");
            inputCustomer = input.nextLine();

            if (inputCustomer.length() == 5) {
                break;
            } else {
                System.out.println("Error, must be 5 characters long");
            }
        } while (!inputSucess);

        return inputCustomer.toUpperCase();
    }

    private int inputAccountNumber() {
        int inputNumber = 0;
        boolean inputSucess = false;
        do {
            System.out.print("Enter account number: ");
            try {
                inputNumber = input.nextInt();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the account number");
                } else {
                    Pattern pattern = Pattern.compile("^100\\d{3}$");
                    Matcher matcher = pattern.matcher(Integer.toString(inputNumber));
                    if (matcher.matches()) {
                        break;
                    }
                    else {
                        System.out.println("Error, must be 6 digits long and starts with \"100\"");
                    }

                }
            } catch (InputMismatchException error) {
                System.out.println("Error, account must be number");
                input.next();
            }
        } while (!inputSucess);
        return inputNumber;

    }

    private long inputAmount() {
        long inputAmount = 0;
        boolean inputSucess = false;
        do {
            System.out.print("Enter amount: ");
            try {
                inputAmount = input.nextLong();
                if (inputAmount <= 0) {
                    System.out.println("Please enter a non-negative value for the amount");
                } else {
                    break;
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, must be number");
                input.next();
            }
        } while (!inputSucess);
        return inputAmount;
    }


}
