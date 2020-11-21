package hospital;

import javax.swing.JOptionPane;

import generalclasses.Date;
import generalclasses.Time;

public class Demo {

	public static void main(String[] args) {
		Doctor[] doctor = new Doctor[2];
		Patient[] patient = new Patient[3];
		Date date = new Date();
		int op;
		Time time = new Time();
		for (int i = 0; i < 2; i++) {
			doctor[i] = new Doctor();
			doctor[i].getdata();

		}
		do {
			JOptionPane.showMessageDialog(null,
					"*****MENU*****" + "\n" + "enter a option" + "\n" + "1 : Add an indoor patient" + "\n"
							+ "2 : Add an outdoor patient" + "\n" + "3 : See the list of all Doctors" + "\n"
							+ "4 : Search a doctor by name or department" + "\n"
							+ "5 : See the list of all indoor patients" + "\n"
							+ "6 : See the list of all appointments on a certain day" + "\n"
							+ "7 : See the list of appointments of a certain doctor" + "\n"
							+ "8 : Change the date or time of appointment of a certain patient");
			String option = JOptionPane.showInputDialog("Enter the option");
			// convert strings input to integer value
			op = Integer.parseInt(option);

			if (op == 1) {
				for (int i = 0; i < 1; i++) {
					IndoorPatient p = new IndoorPatient();
					patient[i] = p;
					patient[i].getdata(doctor, 2);
				}
			} else if (op == 2) {
				for (int i = 1; i < 3; i++) {
					OutdoorPatient O = new OutdoorPatient();
					patient[i] = O;
					patient[i].getdata(doctor, 2);
					patient[i].show();
				}
			} else if (op == 3) {

				for (int i = 0; i < 2; i++) {
					doctor[i].show();
				}
			} else if (op == 4) {
				String named = JOptionPane.showInputDialog("Enter the name of doctor you want to search");
				for (int i = 0; i < 2; i++) {
					if (named.equalsIgnoreCase(doctor[i].getName())) {
						JOptionPane.showMessageDialog(null, "found");
						doctor[i].show();
						break;
					}

				}
			} else if (op == 5) {

				for (int i = 0; i < 1; i++) {
					patient[i].show();
				}
			} else if (op == 6) {
				JOptionPane.showMessageDialog(null, "enter the date ");
				date.getinput();
				for (int i = 0; i < 3; i++) {
					if (patient[i] instanceof OutdoorPatient) {
						if (date.getDay() == patient[i].getdate().getDay()
								&& date.getMonth() == patient[i].getdate().getMonth()
								&& date.getYear() == patient[i].getdate().getYear()) {
							patient[i].show();
						}
					}
				}

			} else if (op == 7) {
				String named = JOptionPane.showInputDialog("Enter the name of doctor");
				for (int i = 0; i < 2; i++) {
					if (named.equalsIgnoreCase(patient[i].getdoctor().getName())) {
						patient[i].show();
					}
				}
			} else if (op == 8) {
				int choice = 0;
				String named = JOptionPane.showInputDialog(
						"Enter the name of patient whose date or time of appointment you want to change");
				for (int i = 0; i < 3; i++) {
					if (named.equalsIgnoreCase(patient[i].getName())) {
						JOptionPane.showMessageDialog(null, "press date for 1 and time for 2");
						String opp = JOptionPane.showInputDialog("Enter the option");
						// convert strings input to integer value
						choice = Integer.parseInt(opp);
						if (choice == 1) {
							date.getinput();
							patient[i].getdate().setDay(date.getDay());
							patient[i].getdate().setMonth(date.getMonth());
							patient[i].getdate().setYear(date.getYear());
							JOptionPane.showMessageDialog(null, "date has been changed");
						} else if (choice == 2) {
							if (patient[i] instanceof OutdoorPatient) {
								time.getdata();
								patient[i].gettime().setHours(time.getHours());
								patient[i].gettime().setMinutes(time.getMinutes());
								patient[i].gettime().setS(time.getS());
								JOptionPane.showMessageDialog(null, "time has been changed");
							} else {
								JOptionPane.showMessageDialog(null, "this patient is not a outdoor patient");
							}
						}
					}
				}
			}
		} while (op != 8);

	}

}
