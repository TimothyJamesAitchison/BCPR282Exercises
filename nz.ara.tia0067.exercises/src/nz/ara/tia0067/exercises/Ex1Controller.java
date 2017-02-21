package nz.ara.tia0067.exercises;

public class Ex1Controller extends Controller{
	protected IView theView;
	public Ex1Controller(IView theView){
		super(theView);
	}
	
	@Override
	public void go(){
		this.myView.start();
		String data = this.myView.get();
		int intData = Integer.parseInt(data);
		Model theModel = new Model();
		String result = theModel.checkMark(intData);
		System.out.println("Your grade is: " + result);
	}
}
