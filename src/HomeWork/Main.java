package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StaffManager staffManager = new StaffManager();
        String yourChoose;

        do {
            mainMenu();
            yourChoose = input.nextLine();
            switch (yourChoose) {
                case "1":
                    System.out.println("[1] Add");
                    staffManager.addStaff();
                    break;
                case "2":
                    System.out.println("[2] Display");
                    staffManager.displayData();
                    break;
                case "3":
                    System.out.println("[3] Sort");
                    staffManager.sortData();
                    break;
                case "4":
                    System.out.println("[4] Edit by ID");
                    staffManager.editData();
                    break;
                case "5":
                    System.out.println("[5] Find by ID");
                    staffManager.findStaffByID();
                    break;
                case "6":
                    System.out.println("[6] Remove by ID");
                    staffManager.removeData();
                    break;
                case "7":
                    staffManager.totalSalary();
                    break;
                case "8":
                    System.out.println("See you again!");
                    break;
                case "9":
                    System.out.println("See you again!");
                    break;
                default:
                    System.out.println("Number is not available, please try again");
                    break;
            }
        } while (!yourChoose.equals("8"));
    }

    private static void mainMenu() {
        System.out.println("====");
        System.out.println("MENU");
        System.out.println("\t1. Add");
        System.out.println("\t2. Display");
        System.out.println("\t3. Sort");
        System.out.println("\t4. Edit by ID");
        System.out.println("\t5. Find by ID");
        System.out.println("\t6. Remove by ID");
        System.out.println("\t7. Total SALARY");
        System.out.println("\t8. Save to file");
        System.out.println("\t9. Exit");
        System.out.print("Please choose [1 - 9]: ");
    }

}
