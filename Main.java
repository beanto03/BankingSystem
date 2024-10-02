import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankOperation bo = new BankOperation(null, 0);
        Scanner sc = new Scanner(System.in);    
        
        // Create user
        BankOperation user1 = new BankOperation("Amir", 100);
        BankOperation user2 = new BankOperation("Aiman", 200);
        BankOperation user3 = new BankOperation("Ali", 300);

        // Add user 
        bo.addUser(user1);
        bo.addUser(user2);
        bo.addUser(user3);


        System.out.println("Enter name: ");
        String nameInput = sc.nextLine(); 
        int userInput;
        double amountInput;
        do{
            System.out.println("----Main Manu----");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");
            userInput = sc.nextInt();

            switch (userInput) {
            case 1: 
                bo.displayBalance();
                break;
            case 2: 
                System.out.println("Enter amount: ");
                amountInput = sc.nextDouble();
                bo.withdrawAmount(nameInput, amountInput);
                break;
            case 3:
                System.out.println("Enter amount: ");
                amountInput = sc.nextDouble();
                bo.insertAmount(nameInput, amountInput);
                break;
            default:
                break;
            }
            
        } while(userInput == 4);
            System.exit(0);
    }
}
