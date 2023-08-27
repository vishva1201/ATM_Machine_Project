package BankATM;

import java.io.IOException;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class OptionMenu extends Account {
	    Scanner menuInput=new Scanner(System.in);
	    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	    HashMap<Integer,Integer> data =new HashMap<Integer,Integer>();
	
	    
	    /*validate login information customer number and pin number*/
	  
    public void getLogin() throws IOException {
    	int x=1;
    	
    	do {
    		try {
    			data.put(12345678,1234);
    			data.put(87654321,8765);
    			
    			System.out.println("Welcome To The ATM Project!");
    			
    			System.out.println("Enter Your Customer Number:    ");
    			setCustomerNumber(menuInput.nextInt());
    			
    			System.out.println("Enter Your Pin Number:    ");
    			setPinNumber(menuInput.nextInt());
    		}
    		catch(Exception e) {
    		    System.out.println("\n" + "Invalid Character(s).Only Numbers."+"\n");
    		    x=2;
    		}
    		for(Entry<Integer,Integer> entry : data.entrySet()) {
    			if(entry.getKey()== getCustomerNumber() && entry.getValue() == getPinNumber()) {
    				getAccountType();
    		   }
    		}
    	    
    	    System.out.println("\n"+ "Invalid customer Number or Pin Number"+ "\n");
           
            }while(x==1); 
    	    }
      

                /*Display Account Type Menu With Selection*/



     public void getAccountType() {
    	 System.out.println("Select the Account you want to Access: ");
    	 System.out.println("Type 1 - Checking Account");
    	 System.out.println("Type 2 - Saving Account");
    	 System.out.println("Exit");
    	 System.out.println("Choice: ");
    	 
    	 selection = menuInput.nextInt();
    	 
    	 switch(selection){
         case 1:
    	     getChecking();
  	         break;
    	 case 2:
  		     getSaving();
  		     break;
    	 case 3:
    	     System.out.println("Thank You for using ATM");
   		     break;
       	 default:
    	     System.out.println("\nInvalid Choice.\n");
             getAccountType();
    	 }
     }
     
     /* Display Checking Account Number Menu with Selection */
     public void getChecking() {
 		System.out.println("\nChecking Account: ");
 		System.out.println("Type - 1 - View Balance");
 		System.out.println("Type - 2 - Withdraw Funds");
 		System.out.println("Type - 3 - Deposit Funds");
 		System.out.println("Type - 4 - Back");
 		System.out.println("Type - 5 - Exit");
 		System.out.print("Choice: ");

 		selection = menuInput.nextInt();
 		switch (selection) {
 		case 1:
 			System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
 			getChecking();
 			break;
 		case 2:
 			getCheckingWithdrawInput();
 			getChecking();
 			break;
 		case 3:
 			getCheckingDepositInput();
 			getChecking();
 			break;
 		case 4:
 			getAccountType();
 			break;
 		case 5:
 			System.out.println("Thank You for Using ATM.");
 			System.exit(0);
 			break;
 		default:
 			System.out.println("\nInvalid Choice.\n");
 			getChecking();
 		}
     }
 		
 		
 		/* Display Savings Account Number Menu with Selection */
 		public void getSaving() {
 			System.out.println("\nSaving Account: ");
 			System.out.println("Type - 1 - View Balance");
 			System.out.println("Type - 2 - Withdraw Funds");
 			System.out.println("Type - 3 - Deposit Funds");
 			System.out.println("Type - 4 - Back");
 			System.out.println("Type - 5 - Exit");
 			System.out.print("Choice: ");

 			selection = menuInput.nextInt();
 			switch (selection) {
 			case 1:
 				System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
 				getSaving();
 				break;
 			case 2:
 				getSavingWithdrawInput();
 				getSaving();
 				break;
 			case 3:
 				getSavingDepositInput();
 				getSaving();
 				break;
 			case 4:
 				getAccountType();
 				break;
 			case 5:
 				System.out.println("Thank You for Using ATM.");
 				System.exit(0);
 				break;
 			default:
 				System.out.println("\nInvalid Choice.\n");
 				getSaving();
 			}
 		}
 		int selection; 
 	} 		

 	
