//Program to illustrate encapsulation and use of  THIS keyword
package javaAssignment;

public class ecapsulationExample {

	public static void main(String[] args) {
		BankData B1 = new BankData();
		B1.setBankid(1234);
		B1.setCustomerid(123456);
		System.out.println(B1.getBankid());
		System.out.println(B1.getCustomerid());
	}

}

class BankData {
	private int bankid;
	private int customerid;

	// by using getters and setters we can access the variable
	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		// using THIS keyword to initialize values
		this.bankid = bankid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

}

