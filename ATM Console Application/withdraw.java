//package atm_interface;

public class withdraw extends Transactions_History{

    // private int amount;
    // private int AccountNo;
    private int balance;

    withdraw (int amount){
        // this.amount = amount;
        // this.AccountNo=AccountNo;
        balance= Balance;

       if (amount<=balance){
        balance = deb_balance(amount);
        
        System.out.printf("Rs.%d has been debited from your account.\nYour current balance is  : Rs.%d",amount,balance);
       }
       else {
        System.out.println("Insufficient balance!!");
       }
    }
    
}
