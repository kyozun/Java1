package Final;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        String yourChoose;
        List<Account> accountLists = new LinkedList<>();

        do {
            mainMenu();
            yourChoose = input.nextLine();
            switch (yourChoose) {
                case "1":
                    System.out.println("[1] Add Account");
                    account.inputData();
                    accountLists.add(account);
                    break;
                case "2":
                    System.out.println("[2] Display");
                    for (Account accountList:accountLists) {
                        accountList.displayData();
                    }
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