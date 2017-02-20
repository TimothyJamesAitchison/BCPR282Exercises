package nz.ara.tia0067.exercises;
import java.io.IOException;
//import java.util.Scanner;

public class Controller {
	protected View myView;
	private String data;
	public Controller(View theView){
		this.myView = theView;
	}
	
	public void go(){
		this.myView.start();
		data = this.myView.get();
		this.myView.say(this.data);
		try{
			this.myView.stop();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
