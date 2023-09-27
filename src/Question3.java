import java.util.Scanner;
import java.text.DecimalFormat;

public class Question3 {
	public static void main(String[] args) {

			
	Scanner keyboard = new Scanner(System.in);
	
	//Declare th variables
	int counter =1;
	double excessCal;
	double currentWeight;
	double gainWeight;
	
	//Formatting numbers: Print the numbers with maximum two decimal places
	DecimalFormat df2 = new DecimalFormat("0.00");
	
	//Prompt user to input 
	while (true) { 
		System.out.println("Enter your current weight, or q to quit: ");
		String input = keyboard.next();
		
		if (input.equals("q")) {
				System.out.printf("\nExiting...\n");//program will stop looping if q is entered
				break; 
		}
		  	
		  	try {
		  			currentWeight= Double.parseDouble(input); 
		  			
		  		}
		    catch (Exception e) { //catch error & execute code to handle
		    		System.out.printf("Error: %s is not a valid weight.\n\n", input);//%s is format specifier , it displays string that stored in input
			
		    continue;//end the current iteration & continues to the next iteration. 
		   } 
		 
		  	System.out.println("Enter number of excess calories that you eat in a month,or q to quit: ");
		  	String in = keyboard.next();
		  
		  		if (in.equals("q")) {
		  				System.out.printf("\nExiting...\n");
		  				break; 
		  			} 	
		  		try {
			  			excessCal= Double.parseDouble(in); 
			  			}
		  		catch (Exception e) {
		  			System.out.printf("Error: %s is not a valid calories.\n\n", in);
		  			continue; 
		  		}
		  		
		  	//Calculation for amount weight that user will gain in 1 year
		  	gainWeight = (excessCal/7000)*12;
			
		  	//Using loop to display current weight & amount weight that user will gain in 10 years 
			while(counter<=10) {
				gainWeight = gainWeight + gainWeight;
				currentWeight = currentWeight + gainWeight;
				System.out.println("In Year " + counter + ",\nTotal amount of weight that you gained = " + df2.format(gainWeight)+" kgs" + "\nCurrent Weight = " + df2.format(currentWeight) +" kgs.\n" );
				counter++; //increment
			}
		}
		keyboard.close();
	}
}
	