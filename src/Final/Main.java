package Final;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        String yourChoose;
        do {
            mainMenu();
            yourChoose = input.nextLine();
            switch (yourChoose) {
                case "1":
                    System.out.println("[1] Add Account");
                    accountManager.inputData();
                    break;
                case "2":
                    System.out.println("[2] Display");
                    accountManager.displayData();
                    break;
                case "3":
                    System.out.println("[3] Deposit and Withdraw");
//                    accountManager.depositAndWithdraw();
                    break;
                case "4":
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Number is not available, please try again");
                    break;
            }
        } while (!yourChoose.equals("4"));
    }

    private static void mainMenu() {
        System.out.println("====");
        System.out.println("BANK");
        System.out.println("\t1. Add Account");
        System.out.println("\t2. Display");
        System.out.println("\t3. Deposit and Withdraw");
        System.out.println("\t4. Exit");
        System.out.print("Please choose [1 - 4]: ");
    }
}