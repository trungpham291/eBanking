import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBank accBank = new AccountBank();
        ArrayList<AccountBank> banks = new ArrayList<>();

        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter account name: ");
        String accountName = sc.nextLine();
        System.out.println("Enter account balance: ");
        double accountBalance = sc.nextDouble();
        sc.nextLine();

        banks.add(accBank);
        accBank.setAccountNumber(accountNumber);
        accBank.setAccountHolderName(accountNumber);
        accBank.setBalance(accountBalance);
        System.out.println("Successfully added account !");


        while(true){
            System.out.println("Enter your choice : ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Transfer");
            System.out.println("4.Check Balance");
            System.out.println("0.Exit");
            System.out.println("Your choice is:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;

            }if(choice == 0) {
                System.out.println("Thank you for using our system, goodbye and good luck ");
                break;
            }
        }


    }
}
