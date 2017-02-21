package nz.ara.tia0067.exercises;

public class Ex8Controller extends Controller {
	protected IView theView;
	public Ex8Controller(IView theView){
		super(theView);
	}
	
	@Override
	public String doExercise(){
		String result;
		Model theModel = new Model();
		result = theModel.countOdd();
		return result;
	}
}
