package nz.ara.tia0067.exercises;

public class Ex5Controller extends Controller{
	protected IView theView;
	public Ex5Controller(IView theView){
		super(theView);
	}
	
	@Override
	public void go(){
		this.myView.start();
		Model theModel = new Model();
		String result = theModel.sumAndAverageWhile();
		System.out.println(result);
	}
}
