package nz.ara.tia0067.exercises;

public class SumAndAverage {

	public static void main(String[] args) {
		ConsoleView theView = new ConsoleView();
		Ex4Controller theController = new Ex4Controller(theView);
		theController.go();
	}

}