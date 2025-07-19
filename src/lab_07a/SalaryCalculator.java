package lab_07a;

/**
 * ## LAB 7.1
 * - Create a class Employee with a method salary to return employee’s salar
 * - There are 2 types of employee: Full time employee and contract employee
 * - Full time employee has salary is 50000 and contract employee has salary 40000
 * - Write a method to accept a list of Employee and calculate total salary
 * - For example, company has 3 FTE and 2 contractor
 */

public class SalaryCalculator {

    public static void main(String[] args) {
        Employee[] employees = getEmployees();
        double totalSalary = calculateTotalSalary(employees);
        System.out.println("Total Salary: " + totalSalary);
    }

    private static Employee[] getEmployees() {
        Employee[] employees = new Employee[5];
        employees[0] = new FulltimeEmployee("Alice", 50000);
        employees[1] = new FulltimeEmployee("Bob", 50000);
        employees[2] = new FulltimeEmployee("Charlie", 50000);
        employees[3] = new ContractEmployee("David", 40000);
        employees[4] = new ContractEmployee("Eve", 40000);
        return employees;
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double total = 0.0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }
}
