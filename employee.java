package javaAssignment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class employeeDetails {
	private int ID;
	private String Name;
	private String Technology;
	private String DOJ;

	public employeeDetails(int iD, String name, String technology, String edoj) {
		this.ID = iD;
		this.Name = name;
		this.Technology = technology;
		this.DOJ = edoj;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getTechnology() {
		return Technology;
	}

	public void setTechnology(String technology) {
		Technology = technology;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String toString() {
		return ID + " " + Name + "" + Technology + "" + DOJ;

	}

}

class employee {
	public static void main(String[] args) {
		List<employeeDetails> c = new ArrayList<employeeDetails>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter option from below");
			System.out.println("1: Add employee details");
			System.out.println("2: Read employee details");
			System.out.println("3: Edit employee details");
			System.out.println("4: Delete employee details");
			System.out.println("5: Exit the Program");
			System.out.println("6: display the records");
			System.out.print("Please Enter your choice : ");
			choice = sc.nextInt();
			int eno = 0;
			String ename = null;
			String eTech = null;
			String edoj = null;
			Iterator<employeeDetails> i = c.iterator();
			switch (choice) {
			case 1:
				System.out.print("Please enter Employee Id : ");
				eno = sc.nextInt();
				System.out.print("Please enter Employee name : ");
				ename = sc1.nextLine();
				System.out.print("Please enter Technology : ");
				eTech = sc1.nextLine();
				System.out.println("Enter the Employee DOJ:");
				edoj = sc1.nextLine();
				c.add(new employeeDetails(eno, ename, eTech, edoj));
				break;
			case 2:

				boolean found = false;
				try {
					System.out.println("Enter Employee Number to search");
					eno = sc.nextInt();
					i = c.iterator();
					while (i.hasNext()) {
						employeeDetails e = i.next();
						if (e.getID() == eno) {
							found = true;
							System.out.println(e);
							System.out.println("-------------------------");
						} else
							System.out.println("Record Not Found");
					}
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				break;
			case 4:
				found = false;
				try {
					System.out.println("Enter Employee Number to delete the record");
					eno = sc.nextInt();
					i = c.iterator();
					while (i.hasNext()) {
						employeeDetails e = i.next();
						if (e.getID() == eno) {
							i.remove();
							found = true;
							System.out.println("Your record is delete succesfully");

						}
					}
				} catch (InputMismatchException exception) {
					System.out.println("Invalid, Id should be an integer value");
					exception.printStackTrace();
				}

				if (!found) {
					System.out.println("Record Not Found");
				}
				break;
			case 3:
				found = false;
				try {
					System.out.println("Enter Employee Number to update the record");
					eno = sc.nextInt();
					ListIterator<employeeDetails> li = c.listIterator();
					while (li.hasNext()) {
						employeeDetails e = li.next();
						if (e.getID() == eno) {
							System.out.println("Enter new name");
							ename = sc1.nextLine();
							System.out.println("Enter new Technology");
							eTech = sc1.nextLine();
							System.out.println("Enter new Doj");
							edoj = sc1.nextLine();
							li.set(new employeeDetails(eno, ename, eTech, edoj));
							System.out.println("Your record is update succesfully");

						}
						if (!found) {
							System.out.println("Record Not Found");
						}
					}
				} catch (InputMismatchException exception) {
					System.out.println("Invalid, Id should be an integer value");
					exception.printStackTrace();
				}

				break;
			case 5:
				System.out.println("Exiting the Program Now");
				System.exit(0);
				break;
			case 6:
				while (i.hasNext()) {
					employeeDetails e = i.next();
					System.out.println("-------------------------");
					System.out.println(e);
					System.out.println("-------------------------");
				}
				break;

			default:
				System.out.println("This is Not a Valid Choice! Please Select Another");
				break;

			}
		} while (choice != 0);
	}

}
