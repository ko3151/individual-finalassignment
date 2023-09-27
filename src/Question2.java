import java.awt.Image;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Question2 {
	public static void main(String[] args) {
		// Declare variables
		final int MYVI_PRICE = 42000;
		final int HONDA_PRICE = 80000;
		final int BMW_PRICE = 300000;
		final int BASIC_SALARY = 2000;
		final double MYVI_RATE = 0.03;
		final double HONDA_RATE = 0.05;
		final double BMW_RATE = 0.08;
		double total;
		String name;
		int numberOfMyvi;
		int numberOfHonda;
		int numberOfBMW;
		double MyviCommission;
		double HondaCommission;
		double BMWCommission;
		double salary;
		
		//Resize the icon
		ImageIcon icon1 = new ImageIcon
				(new ImageIcon("underperformer.png").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
		ImageIcon icon2 = new ImageIcon
				(new ImageIcon("targetmet.png").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));
		ImageIcon icon3 = new ImageIcon
				(new ImageIcon("superstar.png").getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT));

		//Prompt user to input values 
		//Read from keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your name : ");
		name = keyboard.nextLine();
		System.out.print("Please number of each type of cars sold \nMyvi : ");
		numberOfMyvi = keyboard.nextInt();
		System.out.print("Honda City : ");
		numberOfHonda = keyboard.nextInt();
		System.out.print("BMW : ");
		numberOfBMW = keyboard.nextInt();
	
		
		//Calculation for commission 
		MyviCommission = numberOfMyvi*MYVI_PRICE*MYVI_RATE;
		HondaCommission = numberOfHonda*HONDA_PRICE*HONDA_RATE;
		BMWCommission = numberOfBMW*BMW_PRICE*BMW_RATE;
		total = MyviCommission + HondaCommission + BMWCommission;
		salary = BASIC_SALARY + total;
		
		//Formatting numbers: Print the numbers with maximum two decimal places
		DecimalFormat df2 = new DecimalFormat("#.##");

		
		/* classified the salesperson into category 
		 * by using if...else statements*/
		if(salary < 5000) {
			JOptionPane.showMessageDialog(null,"\nHi " + name + " !\nYour earnings for this month is " + "RM" + df2.format(salary) + "\nYou are classified as Under Performer.",null, JOptionPane.INFORMATION_MESSAGE,icon1);
			}
		else if ((salary > 5000)&&(salary<10000)){
			JOptionPane.showMessageDialog(null,"\nHi " + name + " !\nYour earnings for this month is " + "RM" + df2.format(salary)+ "\nYou are classified as Target Met.",null, JOptionPane.INFORMATION_MESSAGE,icon2);
			}
		
		else if (salary > 10000){
			JOptionPane.showMessageDialog(null,"\nHi " + name + " !\nYour earnings for this month is " + "RM" + df2.format(salary)+ "\nYou are classified as Superstar.",null, JOptionPane.INFORMATION_MESSAGE,icon3);
		}
		
		keyboard.close();
}
}
