class Employee {
    static double taxRate;

    
    static {
        taxRate = 12.5;
        System.out.println("Tax Rate Set: " + taxRate + "%");
    }

    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " Tax Rate: " + taxRate + "%");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Priya");

        e1.show();
        e2.show();
    }
}
