//Abstract class-which contains both implemented and unimplemented methods but interfaces will have only unimplemented methods

package javaAssignment;

abstract class Interview {
	public abstract void RecordingNotes();
	public void WrtingLiveNotes() {
		System.out.println("MOM points has been noted");
	}
}
class Discussion extends Interview {
	public void RecordingNotes() {
		// The body of RecordingNotes() is implemented in sub class
		System.out.println("live recording has been completed");
	}
}

class abstractExample {
	public static void main(String[] args) {
		Discussion D = new Discussion();
		D.RecordingNotes();
		D.WrtingLiveNotes();
	}
}
