package nz.ara.tia0067.exercises;

public class Ex7Controller extends Controller{
	protected IView theView;
	public Ex7Controller(IView theView){
		super(theView);
	}
	
	@Override
	public void go(){
		this.myView.start();
		Model theModel = new Model();
		String result = theModel.sumAverageAndCount(111, 8989);
		System.out.println(result);
	}
}
