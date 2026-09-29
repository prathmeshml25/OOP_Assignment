class Employee
{
    String name;
    double salary;

    static double companyBonus = 5000;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus()
    {
        return salary * 0.10;
    }

    static double calculateCompanyBonus()
    {
        return companyBonus;
    }

    void display()
    {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Individual Bonus: " + calculateBonus());
        System.out.println("Company Bonus: " + calculateCompanyBonus());
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Rahul", 30000);
        Employee e2 = new Employee("Amit", 40000);

        e1.display();
        System.out.println();

        e2.display();
    }
}
