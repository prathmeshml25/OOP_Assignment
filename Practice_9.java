class Car
{
    String model;

    Car(String model)
    {
        this.model = model;
    }

    class Engine
    {
        void start()
        {
            System.out.println(model + " engine started");
        }
    }

    void startCar()
    {
        Engine e = new Engine();
        e.start();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Car c = new Car("BMW");
        c.startCar();
    }
}
