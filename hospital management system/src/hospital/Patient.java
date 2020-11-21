package hospital;

import javax.swing.JOptionPane;

import generalclasses.Date;
import generalclasses.Time;

public class Patient {
	private String name;
	private String phoneno;
	private String address;
	private int age;
	private String CNIC;
	private char gender;

	public Patient() {
		name = "";
		phoneno = "";
		address = "";
		age = 0;
		CNIC = "";
		gender = 'f';
	}

	public Date getdate() {
		Date d = new Date();
		return d;
	}

	public Doctor getdoctor() {
		Doctor d1 = new Doctor();
		return d1;
	}

	public Time gettime() {
		Time t = new Time();
		return t;
	}

	public void getdata(Doctor[] d2, int s) {
		name = JOptionPane.showInputDialog("Enter the name of patient");
		phoneno = JOptionPane.showInputDialog("Enter the phone no of patient");
		address = JOptionPane.showInputDialog("Enter the address of patient");
		String a = JOptionPane.showInputDialog("Enter the age of patient");
		CNIC = JOptionPane.showInputDialog("Enter the CNIC of patient");
		String g = JOptionPane.showInputDialog("Enter the gender of patient");
		gender = g.charAt(0);
		age = Integer.parseInt(a);
	}

	public String getName() {
		return name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getCNIC() {
		return CNIC;
	}

	public char getGender() {
		return gender;
	}

	public void show() {
		JOptionPane.showMessageDialog(null,
				"name of the Patient: " + name + "\n" + "phone no of the Patient: " + phoneno + "\n"
						+ "address of the Patient: " + address + "\n" + "age of the Patient: " + age + "\n"
						+ "CNIC of the Patient: " + CNIC + "\n" + "gender of the Patient: " + gender);

	}

}
