package nz.ara.tia0067.exercises;

public class Ex3Controller extends Controller{
	protected IView theView;
	public Ex3Controller(IView theView){
		super(theView);
	}
	
	@Override
	public void go(){
		this.myView.start();
		String data = this.myView.get();
		int intData = Integer.parseInt(data);
		Model theModel = new Model();
		String result = theModel.printWord(intData);
		System.out.println(result);
	}
}
