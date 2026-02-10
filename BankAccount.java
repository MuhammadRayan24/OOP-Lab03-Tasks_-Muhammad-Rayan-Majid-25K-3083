public class BankAccount {
    int AccNumber;
    String AccHolderName;
    double InitialBalance;

    BankAccount(int number, String name) {
        this.AccNumber = number;
        this.AccHolderName = name;
    }

    BankAccount(int number , String name ,double balance){
        this.AccHolderName=name;
        this.AccNumber=number;
        this.InitialBalance=balance;
    }
    void display(){
        System.out.println("Account Number: "+ AccNumber);
        System.out.println("Account holder Name: "+ AccHolderName);
        System.out.println("Account Balance: "+ InitialBalance);
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount(696906 , "Rayyan" );
        BankAccount b2 = new BankAccount(123536, "Rayyan", 1000.00);
        b1.display();
        b2.display();

    }
}
