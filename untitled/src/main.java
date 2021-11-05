import java.util.Scanner;
public class main {

    public static void main(String[]args){

        BankAccount account = new BankAccount(0, "Unknown");
        System.out.println(account.getBalance());
        System.out.println(account.getName());
        Scanner input = new Scanner (System.in);
        int choice = 0;
        while(choice != 4){
            System.out.println("Select a function");
            System.out.println("1. Deposit" );
            System.out.println("2. Withdraw");
            System.out.println("3. Project Interest");
            System.out.println("4. Exit");
            choice = input.nextInt();
            if (choice == 1){
                System.out.println("Deposit Amount:");
                double depositAmnt = input.nextDouble();
                account.Deposit(depositAmnt);
                System.out.println(account.getBalance());


            }
            else if (choice == 2){
                System.out.println("Withdraw Amount:");
                double withdrawAmnt = input.nextDouble();
                account.Withdraw(withdrawAmnt);
                System.out.println(account.getBalance());
            }
            else if (choice == 3) {
                System.out.println("Years:");
                double yearsAmnt = input.nextDouble();
                System.out.println("Percent Increase:");
                double pAmnt = input.nextDouble();
                System.out.println(account.interest(yearsAmnt, pAmnt));
            }
            else if (choice == 69){
                System.out.println("lmao nice☢");
            }
            else if (choice == 420){
                System.out.println("lmao nicerȾ");
            }
            else if (choice == 42069){
                System.out.println("lmao nicest♘");
            }
            }

    }

}
