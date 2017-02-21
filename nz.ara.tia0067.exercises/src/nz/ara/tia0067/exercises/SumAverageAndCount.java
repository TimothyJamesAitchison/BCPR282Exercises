package nz.ara.tia0067.exercises;

public class SumAverageAndCount {
	public static void main(String[] args){
		ConsoleView theView = new ConsoleView();
		Ex7Controller theController = new Ex7Controller(theView);
		theController.go();
	}
}
