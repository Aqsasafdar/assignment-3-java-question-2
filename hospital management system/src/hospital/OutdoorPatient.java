package hospital;

import javax.swing.JOptionPane;

import generalclasses.Date;
import generalclasses.Time;

public class OutdoorPatient extends Patient {
	public Date d;
	public Time t;
	public Doctor d1;
	private int fee;

	public OutdoorPatient() {
		super();
		fee = 0;
		d = new Date();
		t = new Time();
		d1 = new Doctor();
	}

	public Date getdate() {
		return d;
	}

	public Doctor getdoctor() {
		return d1;
	}

	public Time gettime() {
		Time t = new Time();
		return t;
	}

	public void getdata(Doctor[] d2, int s) {
		super.getdata(d2, s);

		String f = JOptionPane.showInputDialog("Enter the fee ");
		// convert strings input to integer value

		fee = Integer.parseInt(f);
		JOptionPane.showMessageDialog(null, "enter the date of appointment");
		d.getinput();
		String n = JOptionPane.showInputDialog("Enter the name of doctor");
		for (int i = 0; i < s; i++) {
			if (n.equalsIgnoreCase(d2[i].getName())) {
				d1 = d2[i];
			}
		}
		JOptionPane.showMessageDialog(null, "enter the time of appointment");
		t.getdata();

	}
}
