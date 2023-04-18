package Final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        String yourChoose;
        do {
            showMainMenu();
            yourChoose = input.nextLine();
            switch (yourChoose) {
                case "1" -> {
                    System.out.println("Add Account");
                    accountManager.inputData();
                }
                case "2" -> {
                    System.out.println("Display Account");
                    accountManager.displayData();
                }
                case "3" -> {
                    System.out.println("Deposit and Withdraw");
                    accountManager.showDepositAndWithdrawMenu();

                }
                case "4" -> System.out.println("Goodbye and see you again!");
                default -> System.out.println("Number is not available, please try again");
            }
        } while (!yourChoose.equals("4"));
    }

    private static void showMainMenu() {
        System.out.println("====");
        System.out.println("BANK");
        System.out.println("\t1. Add Account");
        System.out.println("\t2. Display Account");
        System.out.println("\t3. Deposit and Withdraw");
        System.out.println("\t4. Exit");
        System.out.print("Please choose [1 - 4]: ");
    }

}