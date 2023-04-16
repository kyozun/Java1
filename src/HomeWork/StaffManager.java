package HomeWork;

import java.util.*;

public class StaffManager {
    List<Staff> staffLists = new LinkedList<>();
    Scanner input = new Scanner(System.in);
    int index = 0;

    public void displayData() {
        if (staffLists.size() > 0) {
            int length = 55;
            String line = String.format("%0" + length + "d", 0).replace('0', '-');
            System.out.println("+" + line + "+");
            System.out.printf("| %-4s | %-12s | %-14s | %-14s |%n", "ID", "Staff", "Name", "Salary");
            System.out.println("+" + line + "+");
            for (Staff staffList : staffLists) {
                staffList.displayData();
            }
            System.out.println("+" + line + "+");

        } else {
            System.out.println("Data not found");
        }

    }

    public void addStaff() {
        boolean isExit = false;
        Staff staff = null;
        do {
            System.out.println("\t1. Employee");
            System.out.println("\t2. Manager");
            System.out.println("\t3. Director");
            System.out.println("\t4. Return");
            System.out.print("Please choose [1 - 4]: ");
            String yourChoose = input.nextLine();
            switch (yourChoose) {
                case "1" -> {
                    staff = new Employee();
                    isExit = true;
                }
                case "2" -> {
                    staff = new Manager();
                    isExit = true;
                }
                case "3" -> {
                    staff = new Director();
                    isExit = true;
                }
                case "4" -> isExit = true;
                default -> System.out.println("Number is not available, please try again");
            }
        } while (!isExit);

        if (staff != null) {
            staff.inputData();
            staff.setID(++index);
            staffLists.add(staff);
            System.out.println("Successfully added");
        }
    }

    public void sortData() {
        switch (staffLists.size()) {
            case 0 -> System.out.println("Data not found");
            case 1 -> System.out.println("Must least 2 IDs to sort");
            default -> {
                boolean isExit = false;
                do {
                    System.out.println("\t1. Sort by ID");
                    System.out.println("\t2. Sort by Staff");
                    System.out.println("\t3. Sort by Name");
                    System.out.println("\t4. Sort by Salary");
                    System.out.println("\t5. Return");
                    System.out.print("Please choose [1 - 5]: ");
                    String yourChoose = input.nextLine();
                    switch (yourChoose) {
                        case "1" -> {
                            isExit = true;
                            staffLists.sort((o1, o2) -> o1.getID() > o2.getID() ? -1 : 1);
                            System.out.println("Successfully sorted by Id");
                        }
                        case "2" -> {
                            isExit = true;
                            staffLists.sort((o1, o2) -> o1.getStaff().compareTo(o2.getStaff()));
                            System.out.println("Successfully sorted by Staff");
                        }
                        case "3" -> {
                            isExit = true;
                            staffLists.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
                            System.out.println("Successfully sorted by Name");
                        }
                        case "4" -> {
                            staffLists.sort((o1, o2) -> o1.getSalary() > o2.getSalary() ? 1 : -1);
                            System.out.println("Successfully sorted by Salary");
                            isExit = true;
                        }
                        case "5" -> isExit = true;
                        default -> System.out.println("Number is not available, please try again");
                    }
                } while (!isExit);
            }
        }
    }

    public void findStaffByID() {
        int ID = this.inputID();
        for (Staff staffList : staffLists) {
            if (staffList.getID() == ID) {
                int length = 55;
                String line = String.format("%0" + length + "d", 0).replace('0', '-');
                System.out.println("+" + line + "+");
                System.out.printf("| %-4s | %-12s | %-14s | %-14s |%n", "ID", "Staff", "Name", "Salary");
                System.out.println("+" + line + "+");
                staffList.displayData();
                System.out.println("+" + line + "+");
                return;
            }
        }
        System.out.printf("No data could be retrieved for the record with ID = %s\n", ID);
    }

    public int inputID() {
        int inputNumber = 0;
        do {
            System.out.print("Enter ID of Staff: ");
            try {
                inputNumber = input.nextInt();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the ID");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, please enter ID again");
                input.next();
            }
        } while (inputNumber <= 0);
        return inputNumber;
    }

    public void editData() {
        int ID = this.inputID();
        for (Staff staffList : staffLists) {
            if (staffList.getID() == ID) {
                staffList.editData();
                System.out.println("Successfully edited");
                return;
            }
        }
        System.out.printf("No data could be retrieved for the record with ID = %s\n", ID);
    }

    public void removeData() {
        boolean found = false;
        int ID = this.inputID();
        for (Staff staffList : staffLists) {
            if (staffList.getID() == ID) {
                staffLists.remove(staffList);
                System.out.println("Successfully removed");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.printf("No data could be retrieved for the record with ID = %s\n", ID);
        } else {
            index = 0;
            for (Staff staffList : staffLists) {
                staffList.setID(++index);
            }
        }
    }

    public void totalSalary() {
        int totalSalary = 0;
        if (staffLists.size() > 0) {
            for (Staff staffList : staffLists) {
                totalSalary += staffList.getSalary();
            }
            System.out.printf("Total Salary: %s%n", totalSalary);

        } else {
            System.out.println("Data not found");
        }
    }


    //    public int inputID() {
//        System.out.print("Enter ID of Staff: ");
//        while (!input.hasNextInt()) {
//            System.out.print("Error, please enter ID again: ");
//            input.next();
//        }
//        while (true) {
//            if (input.nextInt() <= 0) {
//                System.out.print("Please enter a non-negative value for the ID: ");
//            }
//            return input.nextInt();
//        }
//    }
}
