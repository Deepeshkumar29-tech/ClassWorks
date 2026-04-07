/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class InvalidPinException extends Exception{
    InvalidPinException(String str){
        super(str);
    }
}
class InSufficientBalanceException extends Exception{
    InSufficientBalanceException(String str){
        super(str);
    }
}
class Atm{
  private  int pin=1234;
  private int balance=5000;
  public void validatepin(int p) throws InvalidPinException{
      if(p!=pin){
      throw new InvalidPinException("Invalid pin Entered");
      }
      System.out.println("WELCOME");
  }
  public void checkbalance(){
      System.out.println("BALANCE"+balance);
  }
  public void deposit(int a){
      balance=balance+a;
      System.out.println("Deposited Successfully Total Bank Balance:"+balance);
  }
  public void withdraw(int a) throws InSufficientBalanceException{
      if(a>balance){
          throw new InSufficientBalanceException("Balance is too low");
      }
      balance=balance-a;
      System.out.println("NEW BALANCE: "+balance);  
      
  }
    
}
public class Main
{
	public static void main(String[] args) {
		Atm at=new Atm();
		Scanner sc=new Scanner(System.in);
		try{
		    System.out.println("Enter Your Pin");
		    int pin=sc.nextInt();
		    at.validatepin(pin);
		    System.out.println("Enter your Choice 1.check balance 2.deposit 3.withdraw");
		    int choice=sc.nextInt();
		    switch(choice){
		        case 1:
		            System.out.println("Balance: ");
		            at.checkbalance();
		            break;
		        case 2:
		            System.out.println("Enter the amount to be deposited: ");
		            int amount=sc.nextInt();
		            at.deposit(amount);
		            break;
		       case 3:
		           System.out.println("Enter the amount to be withdrawn: ");
		           int amt=sc.nextInt();
		           at.withdraw(amt);
		           break;
		       default:
		       System.out.println("Please Enter the Correct Choice");
		       break;
		    }
		}
		catch(InvalidPinException e){
		    System.out.println(e.getMessage());
		}
		catch(InSufficientBalanceException e){
		    System.out.println(e.getMessage());
		}
	}
}
