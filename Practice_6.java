class Cart
{
    void calculateTotal(double price)
    {
        System.out.println("Total: " + price);
    }

    void calculateTotal(double price, int quantity)
    {
        double total = price * quantity;
        System.out.println("Total: " + total);
    }

    void calculateTotal(double price, int quantity, double discount)
    {
        double total = price * quantity;
        total = total - (total * discount / 100);
        System.out.println("Total after discount: " + total);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Cart c = new Cart();

        c.calculateTotal(100);
        c.calculateTotal(100, 3);
        c.calculateTotal(100, 3, 10);
    }
}
