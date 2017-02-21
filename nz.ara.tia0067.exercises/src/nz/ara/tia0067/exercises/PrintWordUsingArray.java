package nz.ara.tia0067.exercises;

public class PrintWordUsingArray {
	public static void main(String[] args) {
		ConsoleView theView = new ConsoleView();
		Ex3bController theController = new Ex3bController(theView);
		theController.go();
	}
}
