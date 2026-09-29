class Parent
{
    public int publicData = 10;
    protected int protectedData = 20;
    private int privateData = 30;

    void showPrivate()
    {
        System.out.println("Private: " + privateData);
    }
}

class Child extends Parent
{
    void showData()
    {
        System.out.println("Public: " + publicData);
        System.out.println("Protected: " + protectedData);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Parent p = new Parent();

        System.out.println("Public: " + p.publicData);
        p.showPrivate();

        Child c = new Child();
        c.showData();
    }
}
