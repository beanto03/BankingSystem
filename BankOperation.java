import java.util.ArrayList;

public class BankOperation {
    private ArrayList<String> name;
    private ArrayList<Double> balance;
   // private String name;


    public BankOperation() {
        this.name = new Arraylist<>();
        this.balance = new Arraylist<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to add a book to the library
    public void addUser(BankOperation user) {
        bo.add(user);
    }

    public void displayBalance() {
        System.out.println("Balance left: " + balance);
    }

    public double insertAmount(String name, double amount) {
        for (User user : users){
            if (name.isEqual(users)){
                balance = balance + amount;
                user = new user(name, balance);
            } else {
                System.out.println("User not found");
            }
        }  
        return balance;      
    }

    //not complete yet
    public double withdrawAmount(String name, double amount) {
        for (BookOperation bo : bank) {
            if (bo.isEqual(name)) {
                if(amount <= 20) {
                    users.balance = balance - amount;
                } else {
                    System.out.println("Balance is not enough");
                }
                
            } else {
                System.out.println("User not found");
            }
        }
    }
}