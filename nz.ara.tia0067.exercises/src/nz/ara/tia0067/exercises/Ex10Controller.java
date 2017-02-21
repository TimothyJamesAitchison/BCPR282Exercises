package nz.ara.tia0067.exercises;

public class Ex10Controller extends Controller{
	protected IView theView;
	public Ex10Controller(IView theView){
		super(theView);
	}

	@Override
	public String doExercise(){
		String result;
		Model theModel = new Model();
		result = theModel.countSquares();
		return result;
	}
}