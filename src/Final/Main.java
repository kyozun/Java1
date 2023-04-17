package Final;

import HomeWork.StaffManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = null;
        String yourChoose;

        do {
            mainMenu();
            yourChoose = input.nextLine();
            switch (yourChoose) {
                case "1":
                    System.out.println("[1] Add Account");
                    accountManager = new Account();
                    accountManager.inputData();
                    break;
                case "2":
                    System.out.println("[2] Display");
                    break;
                case "3":
                    System.out.println("[3] Deposit or Withdraw");
                    break;
                case "4":
                    System.out.println("[4] Exit");
                    break;

                default:
                    System.out.println("Number is not available, please try again");
                    break;
            }
        } while (!yourChoose.equals("4"));
    }

    private static void mainMenu() {
        System.out.println("====");
        System.out.println("MENU");
        System.out.println("\t1. Add Account");
        System.out.println("\t2. Display");
        System.out.println("\t3. Deposit or Withdraw");
        System.out.println("\t4. Exit");
        System.out.print("Please choose [1 - 4]: ");
    }
}