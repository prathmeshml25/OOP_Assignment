import java.util.Scanner;


public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        int fine;

        if (days > 0) {
            fine = days * 5;
        } else {
            fine = 0;
        }

        System.out.println("Fine = ₹" + fine);
    }
}
