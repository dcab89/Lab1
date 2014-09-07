	import java.util.Scanner;
	
public class Retirement {
	/*Written by Daniel Caballero and Eric Krone
	 * 
	 * A class with methods for calculating the future value of annuity and for 
	 * calculating how much money a user needs saved to retire and withdraw a fixed
	 * monthly income.
	 */
	
	double SaveeachmontH;
	int YearsofworK;
	double AnnualreturNpre;
	double WhatyouneedsaveD;
	int YearsretireD;
	double AnnualreturNpost;
	double RequiredincomE;
	double MonthlyssI;
	
	
	 public Retirement(){
		 // setting default values to zero, no-arg constructor
		 SaveeachmontH = 0;
		 YearsofworK = 0;
		 AnnualreturNpre = 0;
		 WhatyouneedsaveD = 0;
		 YearsretireD = 0;
		 AnnualreturNpost = 0;
		 RequiredincomE = 0;
		 MonthlyssI = 2642;
		 
}
//prompting user input for the amount of years worked
	 public void YearsofworK(){ 
     Scanner input = new Scanner(System.in);
     System.out.print("How many years do you plan to work?  \n");
     this.YearsofworK = input.nextInt();
     }
	 
	 
	 
	 
 //prompt user for the rate of interest while working
	 public void AnnualreturNpre(){
	 Scanner input = new Scanner(System.in);
	 System.out.print("What is your annual return while you are working (0.00 format)?  \n");
	 this.AnnualreturNpre = input.nextDouble();
	 		}
	 
	 
 //prompt user for the amount of years they plan to retire for
	 public void YearsretireD(){
	 Scanner input = new Scanner(System.in);
	 System.out.print("How many years do you plan to be retired?  \n");
	 this.YearsretireD = input.nextInt();
	 }
	 
	 
	 
 //prompt user for the rate of interest while retired
	 public void AnnualreturNpost(){
	 Scanner input= new Scanner(System.in);
	 System.out.print("What is your annual return while you are retired (0.00 format)?  \n");
	 this.AnnualreturNpost = input.nextDouble();
	 }
	 
	 
	 
 //prompt user for the amount of income they require 
	 public void RequiredincomE(){
	 Scanner input = new Scanner(System.in);
	 System.out.print("What is the amount of income you require a month for retirement? \n");
	 this.RequiredincomE = input.nextDouble();
	 }
 
	 
 
 //prompt user for expected social security income amount
	 public void MonthlyssI(){
	 Scanner input = new Scanner(System.in);
	 System.out.print("What is the amount of social security you plan to recieve every month? \n");
	this.MonthlyssI = input.nextDouble();
	 }
	 
	 
	 
 //prompt user for the amount of paycheck they wish to save every month	 
	 public void SaveeachmontH(){
	 Scanner input = new Scanner(System.in);
	 System.out.print("How much do you wish to save from your paycheck each month?  \n");
	 this.SaveeachmontH = input.nextDouble();
	 }

	 
	 
 //calculate annuity 
     public double AnnuitycalC(){
     double AvaL = this.SaveeachmontH*(1-Math.pow(1 + (this.AnnualreturNpre/12), this.YearsofworK*12))/(this.AnnualreturNpre/12);
	 System.out.print(-AvaL);
     return -AvaL;	 
     }

     
     
 //calculate sum needed to withdraw known monthly allowance at known annual return
     public double SavingsneededcalC(){
     double SavingsneedeD = 12*(this.RequiredincomE - this.MonthlyssI)* (1-Math.pow(1+this.AnnualreturNpost/12, -this.YearsretireD*12))/.02;
     System.out.print(SavingsneedeD);
     return SavingsneedeD;
     }

     
     public static void main(String args[]){
     
    	 Retirement planner = new Retirement();
    	 Scanner input = new Scanner(System.in);
    	 int choice = 0;
    	 System.out.print("What would you like to do? \n  1)I would like to calculate my future anuity value \n  2)I would like to calculate my required retirement sum \n");
         choice = input.nextInt();
         
         if (choice == 1){
        	 planner.SaveeachmontH();
        	 planner.AnnualreturNpre();
        	 planner.YearsofworK();
        	 planner.AnnuitycalC();
         }
         
         else if (choice == 2){
        	 planner.RequiredincomE();
        	 planner.AnnualreturNpost();
        	 planner.YearsretireD();
        	 planner.MonthlyssI();
        	 planner.SavingsneededcalC();
         }
     }
}