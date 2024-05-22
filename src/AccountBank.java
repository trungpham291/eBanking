
public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public AccountBank() {

    }


    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        this.balance += amount;
        System.out.println("Transfer successful");
    };

    public void withdraw(double amount){
        if(amount <= 0) {
            System.out.println("Invalid amount");
            return;
        };
        if(amount > this.balance){
            this.balance -= amount;
            System.err.println("Not enough money");
            return;
        }
        this.balance -= amount;
        System.out.println("Transfer successful");

    };

    public void transfer(String destinationAccountNumber, double amount){
        if(amount <= 0){
            System.err.println("Invalid amount");
        };
        if(amount > this.balance){
            System.err.println("Not enough money");
        };
        int destionationAccountIndex = -1;
        for(int i=0; i< Main.accountBank.size(); i++){
            AccountBank destBank = Main.accountBank.get(i);
            if(destBank.getAccountNumber().equals(destinationAccountNumber)){
                destionationAccountIndex = i;
            }
        }
        if(destionationAccountIndex == -1){
            System.err.println("Destionation account does not exist");
            return;
        }

        //PROCESS
        this.balance -= amount;
        AccountBank destBank = Main.accountBank.get(destionationAccountIndex);
        destBank.setBalance(destBank.getBalance() + amount);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}