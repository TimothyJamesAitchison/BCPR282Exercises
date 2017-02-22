package nz.ara.tia0067.exercises;

public class Ex3bController extends Controller{
	protected IView theView;
	public Ex3bController(IView theView){
		super(theView);
	}
	
	@Override
	public String doExercise(){
		this.myView.start();
		String data = this.myView.get();
		int intData = Integer.parseInt(data);
		Model theModel = new Model();
		String result = theModel.printWordFooBar(intData);
		return result;
	}
}
