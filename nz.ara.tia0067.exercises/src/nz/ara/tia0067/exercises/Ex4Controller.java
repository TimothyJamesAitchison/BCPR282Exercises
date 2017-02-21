package nz.ara.tia0067.exercises;

public class Ex4Controller extends Controller{
	protected IView theView;
	public Ex4Controller(IView theView){
		super(theView);
	}
	
	@Override
	public void go(){
		this.myView.start();
		Model theModel = new Model();
		String result = theModel.sumAndAverage();
		System.out.println(result);
	}
}
