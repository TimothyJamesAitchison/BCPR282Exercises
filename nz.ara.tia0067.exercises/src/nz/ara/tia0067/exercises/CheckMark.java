package nz.ara.tia0067.exercises;

public class CheckMark {

	public static void main(String[] args) {
		ConsoleView theView = new ConsoleView();
		Ex1Controller theController = new Ex1Controller(theView);
		theController.go();
	}

}
