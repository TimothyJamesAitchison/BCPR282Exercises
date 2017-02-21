package nz.ara.tia0067.exercises;

public class Ex9Controller extends Controller{
	protected IView theView;
	public Ex9Controller(IView theView){
		super(theView);
	}
	
	@Override
	public String doExercise(){
		String result;
		Model theModel = new Model();
		result = theModel.countSevens();
		return result;
	}
}
