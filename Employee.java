import java.util.Scanner;

class Employee {
    private String name;
    private double baseSalary;
    private double bonusPercent;
    private double taxPercent;

    // Constructor
    public Employee(String name, double baseSalary, double bonusPercent, double taxPercent) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonusPercent = bonusPercent;
        this.taxPercent = taxPercent;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return baseSalary + (baseSalary * bonusPercent / 100);
    }

    // Method to calculate net salary after tax deduction
    public double calculateNetSalary() {
        double gross = calculateGrossSalary();
        double tax = gross * (taxPercent / 100);
        return gross - tax;
    }

    // Method to display employee info
    public void displaySalaryDetails() {
        System.out.println("\n--- Employee Salary Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: " + bonusPercent + "%");
        System.out.println("Tax Deduction: " + taxPercent + "%");
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Net Salary (After Tax): $" + calculateNetSalary());
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Base Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter Bonus Percentage: ");
        double bonus = sc.nextDouble();

        System.out.println("Enter Tax Percentage: ");
        double tax = sc.nextDouble();

        // Create Employee object
        Employee emp = new Employee(name, salary, bonus, tax);

        // Display salary summary
        emp.displaySalaryDetails();

        sc.close();
    }
}
