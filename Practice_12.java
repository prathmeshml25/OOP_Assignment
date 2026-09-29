class Employee
{
    private double salary;

    Employee(double salary)
    {
        this.salary = salary;
    }

    public void setSalary(double newSalary)
    {
        if(newSalary >= salary)
        {
            salary = newSalary;
            System.out.println("Salary updated successfully");
        }
        else
        {
            System.out.println("Salary cannot be decreased");
        }
    }

    public double getSalary()
    {
        return salary;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Employee e = new Employee(30000);

        System.out.println("Current Salary: " + e.getSalary());

        e.setSalary(35000);
        System.out.println("Salary: " + e.getSalary());

        e.setSalary(25000);
        System.out.println("Salary: " + e.getSalary());
    }
}
