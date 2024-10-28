import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Account account = new Account(1000, "0018");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter PIN: ");
        String inputPin = scanner.nextLine();

        if (!account.checkPin(inputPin)) {
            System.out.println("Incorrect PIN. Existing...");
            return;
        }

        boolean running = true;
        while (running){
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            

            switch (choice){
                case 1:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to  withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdrawal(withdrawAmount);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for banking with us");
                    break;
                default:
                    System.out.println("Invalid option. Try again");
            }
        }scanner.close();
    }
}
