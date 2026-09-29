class User
{
    private String password;

    User(String password)
    {
        this.password = password;
    }

    public boolean checkPassword(String input)
    {
        return password.equals(input);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        User u = new User("abc123");

        System.out.println(u.checkPassword("abc123"));
        System.out.println(u.checkPassword("hello"));
    }
}
