package nz.ara.tia0067.exercises;

public class PrintWord {
	public static void main(String[] args) {
		ConsoleView theView = new ConsoleView();
		Ex3Controller theController = new Ex3Controller(theView);
		theController.go();
	}
}
