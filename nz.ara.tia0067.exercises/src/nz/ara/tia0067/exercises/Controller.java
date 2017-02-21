package nz.ara.tia0067.exercises;
import java.io.IOException;
//import java.util.Scanner;

public class Controller {
	protected IView myView;
	public Controller(IView theView){
		this.myView = theView;
	}
	
	public void go(){
		this.myView.start();
		String result = this.doExercise();
		System.out.println(result);
		try{
			this.myView.stop();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public String doExercise(){
		return "undefined";
	}
}
