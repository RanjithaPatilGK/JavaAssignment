//Program to illustrate inheritance

package javaAssignment;

class Doctor {
	public void treatPatient() {
		System.out.println("doctor completed the first level of check-up");

	}
}

// making surgeon class as final so that no other class will extend surgeon
// class
final class Surgeon extends Doctor {
	// method over-riding
	public void treatPatient() {
		super.treatPatient();
		System.out.println("surgeon completed the major operation");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// Doctor doctorObj = new Doctor();
		// treatPatient method in class Doctor will be executed
		// doctorObj.treatPatient();

		Surgeon surgeonObj = new Surgeon();
		// treatPatient method in class Surgeon will be executed
		surgeonObj.treatPatient();
	}

}