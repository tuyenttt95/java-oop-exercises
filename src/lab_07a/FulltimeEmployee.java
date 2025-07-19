package lab_07a;

public class FulltimeEmployee extends Employee {
    private double salary;
    public FulltimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
