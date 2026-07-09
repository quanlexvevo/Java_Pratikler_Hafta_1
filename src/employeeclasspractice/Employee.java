package employeeclasspractice;

public class Employee {
    private String name;
    private double salary;
    private int workingHours, hireYear;

    Employee(int hireYear, int workingHours, double salary, String name) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 10000) {
            return this.salary * 0.03;
        } else {
            return 0.0;
        }
    }

    public double bonus() {
        int overtimeHours = this.workingHours - 40;
        if (overtimeHours > 0) {
            return 30 * overtimeHours;
        }
        return 0.0;
    }

    public double salaryRaise() {
        int yearsWorked = 2026 - this.hireYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        double netSalary = this.salary - this.tax() + this.bonus();
        double totalSalary = this.salary + this.salaryRaise();

        return "Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Working Hours: " + this.workingHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + this.tax() + "\n" +
                "Bonus: " + this.bonus() + "\n" +
                "Salary Raise: " + this.salaryRaise() + "\n" +
                "Net Salary (with tax and bonus): " + netSalary + "\n" +
                "Total Salary (with raise): " + totalSalary;
    }
}