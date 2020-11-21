package generalclasses;

import javax.swing.JOptionPane;

public class Time {
	private int hours;
	private int minutes;
	private String s; // am or pm

	public Time() {
		hours = 0;
		minutes = 0;
		s = "";
	}

	public void getdata() {
		String hrs = JOptionPane.showInputDialog("Enter the hours");
		String min = JOptionPane.showInputDialog("Enter the minutes");
		s = JOptionPane.showInputDialog("Enter am or pm");
		hours = Integer.parseInt(hrs);
		minutes = Integer.parseInt(min);

	}

	public void show() {
		JOptionPane.showMessageDialog(null, "Time : " + hours + ":" + minutes + " " + s);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
