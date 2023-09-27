import java.util.InputMismatchException;
import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//Declare the variables
		String[] name = new String[10];
		int[] age = new int[10];
		int sum = 0;
		boolean validNumber = false;
		
		//Prompt user to input the student's name
		for(int i=0; i<name.length; i++) {
			System.out.print("Enter name of student " + "[" + i + "]" +":");
			name[i] = input.nextLine();
		}
		
		//Determine duplicate value of student names
		for(int i= 0; i<name.length-1; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].equals(name[j]))
					System.out.println(">> " + name[i] + " is duplicate.");
			}
		}
		
		//Prompt user to input the age of students
		//while loop: Keep on asking user for input until a valid value has been entered
		while(!validNumber) {
		for(int z=0; z<age.length; z++) {
			try {
				System.out.print("Enter age of student " + "[" + z + "]" + ":");
				age[z] = input.nextInt();
				sum += age[z];
				
				if(age[z] <=0) { //if user enter 0 or negative values
					System.out.println("Invalid value. Please try again"); //Prompt user to reenter the value
					z--;
				}
				
				else {
					validNumber = true;
				}
				
			}catch(InputMismatchException e) { //handle exception: if values other than integer is entered
				System.out.println("Invalid value. Please try again.");
				z--;
				input.next();
			}
		}}
		//Calculation for the average of student's age
		int average = sum / age.length; 
		System.out.println("\n>> The total number of students is " + age.length + ".");
		System.out.println("\n>> The average of student's age is " + average + ".");
		
		input.close();
	}

}