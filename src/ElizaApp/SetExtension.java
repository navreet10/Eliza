package ElizaApp;

import java.util.HashSet;
import java.util.Random;

public class SetExtension<E> extends HashSet<E>{

	private static final long serialVersionUID = 1L;
	
	public E getRandomVal() {
		Random rnd = new Random();
		int index = rnd.nextInt(this.size());
		return (E) this.toArray()[index];
		
	}
	

}
