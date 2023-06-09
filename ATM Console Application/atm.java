import java.util.ArrayList;
import java.util.Scanner; 



public class atm{
    
    public static void main(String[] args) {

        ArrayList <Integer> arr =  new ArrayList<Integer >();
        Scanner a = new Scanner(System.in);

        System.out.println("Welcome");

        System.out.print("Enter Account noumber : ");
        int AccountNo = a.nextInt();

        System.out.print("\nEnter Pin : ");
        int pin= a.nextInt();

        login user =new  login(AccountNo,pin);
        Transactions_History bal = new Transactions_History ();
        int userBalance =bal.accBalance(AccountNo);
        int i=0;
        while (i<10){
        if (user.loginStatus == true){
            System.out.println("\n1 : Transactions History");
            System.out.println("2 : Withdraw");
            System.out.println("3 : Transfer");
            System.out.println("4 : Deposite");
            System.out.println("5: Quit");
        
        int choice = a.nextInt();
        
        switch(choice){
            case 1: 
            
            System.out.println("Your Account Balance is Rs."+ userBalance);
            if (arr.isEmpty()){
                System.out.println("No recent transactions !");
            }
            else{
            System.out.println("Your Transactions are :"); 
           
            for(int itr=0 ;itr<arr.size();itr++){
                System.out.printf("Transaction %d : %d\n",itr,arr.get(itr));

            }
            }
            break;
            case 2: 
            System.out.print("Enter the amount you have to withdraw : ");
            int amount = a.nextInt();
            System.out.println();
            new withdraw( amount);
            arr.add(-amount);
                    break;
            case 3: 
            System.out.print("Enter the benificiaries account number : ");
            int beificiary = a.nextInt();
            System.out.print("Enter the amount you want to transfer : ");
            int transfer_amount = a.nextInt();
            new transfer( beificiary, transfer_amount);
            arr.add(-transfer_amount);
                    break;
            case 4: 
            System.out.print( "Enter the amount you have to deposite : ");
            int deposite_amount = a.nextInt();
             new deposite(deposite_amount);
            arr.add( +deposite_amount);
            break;
           
            case 5 : 
            System.out.println("Have a nice day :)");
            i=10;     
            System.exit(1);       
            break;    
          
            

            default: System.out.println("please enter valid input!");

        }
        i++;
    }
    else {
        System.out.println("System timed out");
        break;
    }
        

}
        a.close();
    
    
}
}
