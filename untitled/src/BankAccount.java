public class BankAccount {
    double balance;
    String name;
    String bankmenu;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;


    }


    public double getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public void Deposit(double value) {
        this.balance = value + balance;

    }

    public void Withdraw(double value){
     if (value > this.balance) {
         System.out.println("You do not have that amount of schmoney");
     }
     else {
         this.balance = balance - value;
     }
    }

    public double interest(double years, double p){
        double compound = this.balance;
        for(int i = 0; i < years; i++){
            double interest = compound * (p * .01);
            compound = this.balance + interest;
        }
        return compound;

    }

}
