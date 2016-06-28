package ElizaApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InterrupThread implements Runnable{
	List<String> qualifierSet = new ArrayList<String>();
	
	

	@Override
	public void run() {
		qualifierSet.add("Stupid question!!");
		qualifierSet.add("You guys are idiots!!");
		qualifierSet.add("Seriously!!");
		while(true) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				break;
			}
			Random r = new Random();
			System.out.println(qualifierSet.get(r.nextInt(qualifierSet.size())));
		}
		
	}

}
