package lab_07a;

public class ContractEmployee extends Employee {
    private double salary;
    public ContractEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
