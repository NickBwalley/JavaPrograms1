package arraysholdingmanyobjects;

public class AnimalList {
	private Animal[] theAnimal  = new Animal[5];
	private int x = 0;
	
	public void add (Animal A) {
		if(x<theAnimal.length) {
			theAnimal[x] = A;
			System.out.println("Animal added at Index: "+x);
			x++;
		}
	}
	
}
