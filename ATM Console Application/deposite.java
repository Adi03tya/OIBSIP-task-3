//package atm_interface;

public class deposite extends Transactions_History {
    // private int AccountNo;
    // private int deposite_amount;
    private int accBalance;
    
    deposite(int deposite_amount){
        // this.AccountNo = AccountNo;
        // this.deposite_amount = deposite_amount;
       this.accBalance = cred_balance(deposite_amount);
       
        System.out.printf("Rs.%d is successfully deposited into you account your current balance is : Rs.%d",deposite_amount , accBalance);
        
    }
}
