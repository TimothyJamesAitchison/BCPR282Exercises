package nz.ara.tia0067.exercises;

public class CheckNumber {

	public static void main(String[] args) {
		ConsoleView theView = new ConsoleView();
		Ex2Controller theController = new Ex2Controller(theView);
		theController.go();
	}

}