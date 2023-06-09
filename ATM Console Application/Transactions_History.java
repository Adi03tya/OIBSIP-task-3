import java.util.Dictionary;
import java.util.Hashtable;



public class Transactions_History extends atm {
    
    static int Balance;
    
    public  int  accBalance(int AccountNo ) {
        Dictionary <Integer,Integer> userBalance = new Hashtable<>();
        
        userBalance.put(94246866, 5000);
        userBalance.put(98292908,7000);
       
        Balance = userBalance.get(AccountNo);
        return Balance;
    }
    
    public void  updtBalance (int amount){
        Balance = amount;
            
    }
    public int cred_balance (int amount){
        Balance = Balance + amount;
        return Balance;
        
    }
    public int deb_balance(int amount){
        Balance-=amount;
        return Balance;
    }
    
}
