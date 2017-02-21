package nz.ara.tia0067.exercises;

public class Ex2Controller extends Controller{
	protected IView theView;
	public Ex2Controller(IView theView){
		super(theView);
	}
	
	@Override
	public void go(){
		this.myView.start();
		String data = this.myView.get();
		int intData = Integer.parseInt(data);
		Model theModel = new Model();
		String result = theModel.checkNumber(intData);
		System.out.println("The number is a(n): " + result);
	}
}
