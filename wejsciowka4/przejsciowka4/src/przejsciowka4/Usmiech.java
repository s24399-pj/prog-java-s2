package przejsciowka4;

public class Usmiech extends Buzka{

	public Usmiech() {
		super(')');
	}
	
	
	@Override
	public void draw() {
		System.out.println(":-"+test);
	}
	
	@Override
	public boolean czySieUsmiecha() {
		// TODO Auto-generated method stub
		return true;
	}

}
