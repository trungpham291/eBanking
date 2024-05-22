
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<AccountBank> accountBank = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBank accountBank1 = new AccountBank();
        System.out.println("Welcome to E-Bank");
        System.out.println("Please enter the number of accounts : ");
        String accountNumber = sc.nextLine();
        System.out.println("Please enter the account name : ");
        String accountHolderName = sc.nextLine();
        System.out.println("Please enter your account balance : ");
        double accountBalance = sc.nextDouble();
        sc.nextLine();
        accountBank1.setAccountNumber(accountNumber);
        accountBank1.setAccountHolderName(accountHolderName);
        accountBank1.setBalance(accountBalance);
        System.out.println("Your account balance : "+ accountBank1.getBalance());
        System.out.println("Test despoit method.");
        sc.nextLine();
        double despoitAmount = sc.nextDouble();
        System.out.println("Despoit amount : " + despoitAmount);
        accountBank1.deposit(despoitAmount);
        System.out.println("Your account balance : "+ accountBank1.getBalance());

        System.out.println("Test withdraw method.");
//      double withdrawAmount = sc.nextDouble();
        double withdrawAmount = 5000;
        System.out.println("Withdraw amount : " + withdrawAmount);
        accountBank1.withdraw(withdrawAmount);
        System.out.println("Your account after withdraw is : "+ accountBank1.getBalance());
        System.out.println("Test transfer method.");
        AccountBank destinationAccountBank = new AccountBank();
        destinationAccountBank.setAccountNumber("007");
        destinationAccountBank.setAccountHolderName("Trong Trinh");
        destinationAccountBank.setBalance(10000);
        accountBank.add(destinationAccountBank);
        accountBank.add(accountBank1);
        destinationAccountBank.displayAccountInfo();
        accountBank.add(destinationAccountBank);
        accountBank1.transfer("013",5000);
        System.out.println("After transfer method");
        System.out.println("My Account");
        accountBank1.displayAccountInfo();
        System.out.println("Destination Account");
        destinationAccountBank.displayAccountInfo();
    }
}