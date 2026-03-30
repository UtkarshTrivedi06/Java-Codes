class Employee {
    protected String name;
    protected double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary + (baseSalary * 0.05);
    }
}
class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + 2000;
    }
}
class Executive extends Manager {

    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        double managerSalary = super.calculateSalary();
        double incentive = baseSalary * 0.10;

        return managerSalary + incentive;
    }
}
public class CS_2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Alice", 10000);
        System.out.println(e1.calculateSalary()); // 10500

        Employee e2 = new Manager("Bob", 10000);
        System.out.println(e2.calculateSalary()); // 12500

        Employee e3 = new Executive("Charlie", 10000);
        System.out.println(e3.calculateSalary()); // 13500
    }
}