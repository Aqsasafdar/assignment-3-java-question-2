package generalclasses;

import javax.swing.JOptionPane;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void getinput() {

		String d = JOptionPane.showInputDialog("Enter the day");
		String m = JOptionPane.showInputDialog("Enter the month");
		String y = JOptionPane.showInputDialog("Enter the year");
		// convert strings input to integer value
		day = Integer.parseInt(d);
		month = Integer.parseInt(m);
		year = Integer.parseInt(y);

	}

	public void show() {
		JOptionPane.showMessageDialog(null, "Date : " + day + "/" + month + "/" + year);
	}

}
