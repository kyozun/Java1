package HomeWork;

public abstract class Staff {
    private int id;
    private String staff;
    private String name;
    private int salary;

    public abstract void inputData();

    public abstract void displayData();

    public abstract void editData();

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getStaff() {
        return this.staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
