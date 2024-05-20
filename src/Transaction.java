import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {

    Scanner scanner = new Scanner(System.in);



    public void deposit() {
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        balance = balance + amount;

    }
}
