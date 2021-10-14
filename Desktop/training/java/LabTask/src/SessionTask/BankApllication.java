package SessionTask;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankApllication {

	public static void main(String[] args) {
		
		 
        Apllication obj = new Apllication();
      
        obj.Show();
	}

}



class Apllication{
	
	 String name;
	 String add;
	 String cno;
	 String uname;
	 String pwd;
	 int dep;
	 int amt;
	 String type;
	 int Previous_amount;
	 int option;
	 int dep1;
	 int amt2;


	
	
	Scanner sc = new Scanner(System.in);
	
	  void Register() {
		
	    System.out.println("enter your name: ");
		name = sc.nextLine();
		System.out.println("enter your address: ");
		add = sc.nextLine();
		
		System.out.println("enter your username");
		uname = sc.nextLine();
		
 		System.out.println("enter your password");
		pwd = sc.nextLine();
		
		while (!pwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}")) {
			System.out.println("Invalid Password");
			System.out.print("Enter Password again :");
			pwd = sc.next();
		}
		String pwd1 = pwd;
		
		System.out.println("enter amount you want to deposit");
		amt = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("enter your contact number: ");
	   	 cno = sc.nextLine(); 
	   	 String regex = "\\d{10}";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(cno);
		 if(matcher.matches()) {
	         System.out.println("number is valid");
	      } else { 
	         System.out.println("Given phone number is not valid");
	      }

		sc.nextLine();
		
	}
	  
	  
	  void login(String name , String pass) {
		  
		  String UnameCopy = uname;
			
			System.out.println("enter usename:");
			String uname1 = sc.nextLine();
			System.out.println("enter password :");
			String pwd1 = sc.nextLine();
			
			
			while (!pwd1.equals(pwd) || !UnameCopy.matches(uname1)) {
				System.out.println("Invalid Username and Password! \r\n");

				System.out.print("Enter Username :");
				uname1 = sc.next();

				System.out.print("Enter password :");
				pwd1 = sc.next();
			}
			showDetails();
			
	  }
	  
	  
	  
	  void deposit(double amount) {
			if(amount != 0) {
				dep = dep + amt + (int)amount;
				dep1 = (int)amount;
				Previous_amount = amt; 
			}
			
		}
		
		void withdraw(double amount2) {
			if(amount2 != 0) {
				amt2 = (int)amount2;
				dep = dep - (int)amount2;
				Previous_amount = -amt; 
			}
		}
		
		
		void getPrevoiusTransaction() {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now(); 
			System.out.println("Rs. " + amt + " credited to your account. Balance Rs. " + amt + " as on " + dtf.format(now));
			System.out.println("Initial Deposit - Rs " + amt + " as on " + new Date().getDate() );
			
			System.out.println("deposited after login :"+dep1 + " as on " +new Date().getDate());
			System.out.println("Withdraw amount : " +amt2 +" as on " +dtf.format(now));
			System.out.println("your balance is :" +dep );
			System.out.println("prevoius amount :"+Math.abs(Previous_amount) +" as on  "+ new Date().getDate());
			/*
			if(Previous_amount > 0) {
				System.out.println("deposited: " +Previous_amount);
			}
			else if(Previous_amount < 0) {
				System.out.println("withdraw: "+Math.abs(Previous_amount));
			}
			else {
				System.out.println("no transaction occured");
				
			}*/
		}
		
		
		void userinfo(){
			System.out.println("account holder name : " +name );
			System.out.println("account holder address : " +add);
			System.out.println("account holder contact : " +cno );
		}
		
		
		
		void logout() {
			System.out.println("logout is sccuessfull ");
		}
		
		
		void Show() {
			
			
			
			
			
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("--------------------");
				System.out.println("BANK   OF   MYBANK");
				System.out.println("--------------------");
				System.out.println("\n");
				System.out.println("1. register. ");
				System.out.println("2. login.");
				System.out.println("3. update account.");
				System.out.println("4. exit.");
				System.out.println("\n");
				System.out.println("enter your option :");
				option = sc.nextInt();
				
				switch(option) 
				{
						case 1:
							
							System.out.println("\n");
							Register();
							break;
							
							
						case 2:
							login(name , pwd);
							break;	
							
					    case 3:
							System.out.println("\n");
							break;
							
					    case 4:
					    	System.out.println("**********");
					    	break;
					    	
						default:
							System.out.println("inalid option");
							break;
			   }
				
				
			}while(option != 4);		
			System.out.println(" THANK  YOU ");
		
	       }
		
		
		
		
		
		
		 
		void showDetails() 
		{
	       Scanner sc = new Scanner(System.in);
			
			
			
			
			
			

			do{
				System.out.println("-------------");
				System.out.println("  WELCOME  ");
				System.out.println("-------------");
				System.out.println("1. Deposit ");
				System.out.println("2. Transfer ");
				System.out.println("3. last 5 Transactions ");
				System.out.println("4. user information ");
				System.out.println("5. logout ");
				System.out.println("Enter your OPTION ");
				option = sc.nextInt();
				System.out.println("\n");
				
				switch(option) 
				{
						case 1:
							System.out.println("enter an amount want to deposit");
							System.out.println("\n");
							double amount = sc.nextDouble();
							deposit(amount);
							break;
							
							
						case 2:
							System.out.println("enter an amount to withdrwa");
							System.out.println("\n");
							double amount2 = sc.nextDouble();
							withdraw(amount2);
							break;	
							
					    case 3:
							System.out.println("\n");
							getPrevoiusTransaction();
							break;	
						
					    case 4:
					    	System.out.println("user information: ");
					    	userinfo();
					    	break;
					    case 5:
					    	
					    	break;
					   
					   /* case '':
					    	System.out.println("*******************");
					    	break; */
					    
					   default:
						   System.out.println("invalid option! please enter again");
						   break;
					
				}
				
				
			}while(option != 5);
			
			System.out.println("thank you !!!");
		}
		
	
}