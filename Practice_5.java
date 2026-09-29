class Driver
{
    String name;
    String status;

    Driver(String name)
    {
        this.name = name;
        status = "Available";
    }

    void setStatus(String status)
    {
        this.status = status;
    }

    void display()
    {
        System.out.println("Driver: " + name);
        System.out.println("Status: " + status);
    }
}

class Booking
{
    Driver driver;

    Booking(Driver driver)
    {
        this.driver = driver;
    }

    void showBooking()
    {
        driver.display();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Driver d = new Driver("Rahul");

        Booking b1 = new Booking(d);
        Booking b2 = new Booking(d);

        System.out.println("Booking 1:");
        b1.showBooking();

        System.out.println("\nBooking 2:");
        b2.showBooking();

        d.setStatus("Busy");

        System.out.println("\nAfter driver status changed:");

        System.out.println("Booking 1:");
        b1.showBooking();

        System.out.println("\nBooking 2:");
        b2.showBooking();
    }
}
