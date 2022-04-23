package przejsciowka4;

public class Buzka implements Rysowalny, Skalowalny, PrzedstawiaEmocje{

	char test=')';
	public boolean usmiech=false;
	
	public Buzka(char c) {
		test=c;
	}

	@Override
	public void draw(int times) {
		System.out.print(toString());
		if (times > 1)
			System.out.print(")".repeat(times - 1));
		System.out.println();
	}

	@Override
	public void draw() {
		System.out.println(":-(");
	}

	public String toString() {
		return ":-"+test;
	}

	@Override
	public boolean czySieUsmiecha() {
		// TODO Auto-generated method stub
		return usmiech;
	}

	@Override
	public void przestanSieUsmiechac() {
		usmiech=false;
	}

}
