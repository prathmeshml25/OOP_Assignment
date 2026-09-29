class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        
    }

    void transfer(Account receiver, double amount) {
        if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void showBalance() {
        System.out.println(name + " Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account("Amit", 10000);
        Account a2 = new Account("Riya", 3000);

        a1.transfer(a2, 2500);

        a1.showBalance();
        a2.showBalance();
    }
}
