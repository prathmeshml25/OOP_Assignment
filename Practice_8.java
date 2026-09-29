import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        String input = sc.nextLine();

        int age = Integer.parseInt(input);

        if(age >= 18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}
