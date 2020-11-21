package hospital;

import javax.swing.JOptionPane;

import generalclasses.Date;
import generalclasses.Time;

public class IndoorPatient extends Patient {
	private int wardno;
	private int roomno;
	private int bedno;
	private int fee;
	public Doctor d1;
	private Date d;

	public IndoorPatient() {
		super();
		wardno = 0;
		roomno = 0;
		bedno = 0;
		fee = 0;
		d1 = new Doctor();
		d = new Date();
	}

	public Doctor getdoctor() {
		return d1;
	}

	public void getdata(Doctor[] d2, int s) {
		super.getdata(d2, s);
		String w = JOptionPane.showInputDialog("Enter the ward no of patient");
		String r = JOptionPane.showInputDialog("Enter the room no of patient");
		String b = JOptionPane.showInputDialog("Enter the bed no of patient");
		String f = JOptionPane.showInputDialog("Enter the fee of patient");
		// convert strings input to integer value
		wardno = Integer.parseInt(w);
		roomno = Integer.parseInt(r);
		bedno = Integer.parseInt(b);
		fee = Integer.parseInt(f);
		JOptionPane.showMessageDialog(null, "enter the date of admission of patient");
		d.getinput();
		String n = JOptionPane.showInputDialog("Enter the name of doctor");
		for (int i = 0; i < s; i++) {
			if (n.equalsIgnoreCase(d2[i].getName())) {
				d1 = d2[i];
			}
		}
		

	}

	public void show() {

		super.show();
		JOptionPane.showMessageDialog(null, "warno of the Patient: " + wardno + "\n" + "room no no of the Patient: "
				+ roomno + "\n" + "bed no of the Patient: " + bedno + "\n" + "fee : " + fee);
		d1.show();
		d.show();

	}

	public int getWardno() {
		return wardno;
	}

	public int getRoomno() {
		return roomno;
	}

	public int getBedno() {
		return bedno;
	}

	public int getFee() {
		return fee;
	}

	public Doctor getD1() {
		return d1;
	}

	public Date getD() {
		return d;
	}

}
