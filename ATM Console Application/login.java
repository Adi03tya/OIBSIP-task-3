//package atm_interface;

import java.util.Dictionary;
import java.util.Hashtable;
//import java.util.HashMap;

public class login extends Transactions_History {

    private int AccountNo;
    private int pin;
    public boolean loginStatus = false ;
    
    
     login(int AccountNo , int pin ){
        this.AccountNo = AccountNo;
        this. pin = pin; 

        Dictionary <Integer , Integer> input1 = new Hashtable<>();
   

    input1.put(94246866,1234);
    input1.put(98292908,56789);
        if (input1.get(AccountNo)!=null){

        if (pin == input1.get(AccountNo)){
            System.out.printf("Welcome %d\n", AccountNo );
            this.loginStatus=true;
           
        }
        else {System.out.println ("Plese enter a valid password");
                
        }}
        else{
            System.out.println("Please Enter valid Account Number!");
        }
    }

    
    public int getacc(){
        return AccountNo;
    }
    public int getpin(){
        return pin;
    }
    
}
