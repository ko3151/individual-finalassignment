import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Question1 extends JFrame implements ActionListener{
		//Declare variables
		 String storeName;
		 JFrame frame = new JFrame();
		 JPanel panel = new JPanel();
		 
		 JLabel title;
		 JLabel name;
		 JLabel email;
		 JLabel gender;
		 JLabel dateOfBirth;
		 JLabel phone;
		 JLabel address;
		 JLabel reminder;
		 JLabel reminder2;
		 JLabel attend;
		 JLabel specialRequestLabel;
		 JLabel date;
		 JLabel icon;
		 
		 JTextField nameText;
		 JTextField emailText;
		 JTextField phoneText;
		 JTextField dateOfBirthText;
		 JTextField addressText;
		 JTextField specialRequestText;
		 JTextField dateText;
		 JTextField attendText;
		 
		 JButton submit;
		 JComboBox cb;
		 
 Question1(){ 
		 icon = new JLabel();
		 icon.setIcon(new ImageIcon("logo.png"));
		 icon.setBounds(190,-15,150,150);
		 
	     ButtonGroup bg1 = new ButtonGroup();     
	     JRadioButton rb1 = new JRadioButton("Yes", false);
	     rb1.setBounds(40,400,100,100);
	     JRadioButton rb2 = new JRadioButton("No", false);  
	     rb2.setBounds(250,400,100,100);
	     
	     bg1.add(rb1);
	     bg1.add(rb2);
	     
		 String genderType[]={"Male", "Female"};       
		 cb=new JComboBox(genderType);    
		 cb.setBounds(230,210,250,25);
			
		 title = new JLabel("ONLINE DOCTOR'S APPOINMENT FORM");
		 title.setBounds(70,120,450,25);
		 title.setFont(new Font("Courier", Font.BOLD,20 ));//change font style, size
		 
		 name = new JLabel("Full Name (as per NRIC)");
		 name.setBounds(30,170,250,25);
		 
		 gender= new JLabel("Gender");
		 gender.setBounds(30,210,250,25);
		 
		 email = new JLabel("E-mail");
		 email.setBounds(30,250,250,25);
		 
		 phone= new JLabel("Phone Number");
		 phone.setBounds(30,290,250,25);
		 
		 dateOfBirth = new JLabel("Date of Birth");
		 dateOfBirth.setBounds(30,330,150,25);
		 
		 dateOfBirthText = new JTextField();
		 dateOfBirthText.setBounds(230,330,250,25);
		 
		 reminder = new JLabel("MM/DD/YYYY");
		 reminder.setBounds(235,350,250,25);
		 reminder.setFont(new Font("DialogInput", Font.ITALIC,10));
		 reminder.setForeground(Color.gray);//change font colour
		  	
		 address = new JLabel("Address");
		 address.setBounds(30,380,150,25);
		 
		 attend = new JLabel("Have you previously attended our facility?");
		 attend.setBounds(30,420,350,25);
		 
		 date = new JLabel("Appoinment");
		 date.setBounds(30,470,150,25);
		 
		 specialRequestLabel = new JLabel("Special Requests");
		 specialRequestLabel.setBounds(30,520,150,25);
		 
		 nameText = new JTextField();
		 nameText.setBounds(230,170,250,25);
		 
		 emailText = new JTextField();
		 emailText.setBounds(230,250,250,25);

		 phoneText = new JTextField();
		 phoneText.setBounds(230,290,250,25);

		 addressText = new JTextField();
		 addressText.setBounds(230,380,250,25);
		 
		 dateText = new JTextField();
		 dateText.setBounds(230,470,250,25);
		 
		 reminder2 = new JLabel("MM/DD/YYYY");
		 reminder2.setBounds(235,490,250,25);
		 reminder2.setFont(new Font("DialogInput", Font.ITALIC,10));
		 reminder2.setForeground(Color.gray);
		 
		 specialRequestText = new JTextField();
		 specialRequestText.setBounds(25,545,465,50);
		 
		 submit = new JButton("Submit");
		 submit.setBounds(200, 610, 100, 40);
		 submit.setBackground(Color.PINK);
		 submit.setOpaque(true);
		 submit.addActionListener(this);
		 
		 panel.setBackground(new Color(244,240,255));
		 panel.setVisible(true);
		 panel.setLayout(null);
		 panel.add(icon);
		 panel.add(title);
		 panel.add(name);
		 panel.add(gender);
		 panel.add(email);
		 panel.add(phone);
		 panel.add(dateOfBirth);
		 panel.add(address);
		 panel.add(attend);
		 panel.add(specialRequestLabel);
		 panel.add(date);
		 panel.add(reminder);
		 panel.add(reminder2);
		 panel.add(nameText);
		 panel.add(emailText);
		 panel.add(phoneText);
		 panel.add(specialRequestText); 
		 panel.add(dateOfBirthText);
		 panel.add(addressText);
		 panel.add(dateText);
		 panel.add(submit);
		 panel.add(rb1);
		 panel.add(rb2);
		 panel.add(cb);
		 
		 frame.setTitle("ONLINE DOCTOR'S APPOINMENT FORM");
		 frame.add(panel);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(500, 700);
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
		 
	 }
//add actionlistener to button
 @Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()== submit) {
		ImageIcon icon1 = new ImageIcon
				(new ImageIcon("tick.png").getImage().getScaledInstance(200, 250, Image.SCALE_DEFAULT));
		
		storeName = nameText.getText();
		JOptionPane.showMessageDialog(null,  "Thank You!  " + storeName+ "\nYour appoinment has been scheduled.",null, JOptionPane.PLAIN_MESSAGE, icon1);
	}	
 }
 public static void main(String[]args) {
 	new Question1();
	}
	}

