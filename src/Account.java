public class Account {
    private double balance;
    private String pin;

    public Account (double initialBalance, String pin){
        this.balance = initialBalance;
        this.pin = pin;
    }

    public boolean checkPin(String inputPin) {
        return inputPin.equals(pin);
    }

    public double getBalance(){
        return balance;
    }
    public void deposit (double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited Successfully");
        }else {
            System.out.println("Invalid amount entered");
        }
    }

    public void withdrawal(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew money successfully");
        }else {
            System.out.println("Invalid or Insufficient money");
        }
    }
}
