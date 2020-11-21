package hospital;

import javax.swing.JOptionPane;

public class Doctor {
	private String name;
	private String phoneno;
	private String department;
	private String specialization;
	private String CNIC;
	private char gender;

	public Doctor() {
		name = "";
		phoneno = "";
		department = "";
		specialization = "";
		CNIC = "";
		gender = 'f';
	}

	public void getdata() {
		name = JOptionPane.showInputDialog("Enter the name of doctor");
		phoneno = JOptionPane.showInputDialog("Enter the phone no of doctor");
		department = JOptionPane.showInputDialog("Enter the department of doctor");
		specialization = JOptionPane.showInputDialog("Enter the specialization of doctor");
		CNIC = JOptionPane.showInputDialog("Enter the CNIC of doctor");
		String g = JOptionPane.showInputDialog("Enter the gender of doctor");
		gender = g.charAt(0);
	}

	public String getName() {
		return name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public String getDepartment() {
		return department;
	}

	public String getSpecialization() {
		return specialization;
	}

	public String getCNIC() {
		return CNIC;
	}

	public char getGender() {
		return gender;
	}

	public void show() {
		JOptionPane.showMessageDialog(null,"name of the doctor: " + name+"\n"+"phone no of the doctor: " + phoneno+"\n"+"department of the doctor: " + department+"\n"+"specialization of the doctor: " + specialization+"\n"+"CNIC of the doctor: " + CNIC+"\n"+"gender of the doctor: " + gender);
		
	}
}
