package ElizaApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class ElizaApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String,String> replacementMap = new HashMap<String,String>();
		List<String> hedgeSet = new ArrayList<String>();
		List<String> qualifierSet = new ArrayList<String>();

		replacementMap.put("my", "your");
		replacementMap.put("me", "you");
		replacementMap.put("i", "you");
		replacementMap.put("am", "are");
		replacementMap.put("you", "me");
		replacementMap.put("your", "my");
		
		hedgeSet.add(0,"Please tell me more");
		hedgeSet.add(1,"Many of my patients tell me the same thing");
		hedgeSet.add(2,"It is getting late, maybe we had better quit");
		
		
		
		qualifierSet.add("Why do you say that");
		qualifierSet.add("You seem to think that");
		qualifierSet.add("So, you are concerned that");
		
		StringBuilder output;
		String[] input;
		System.out.println("Hi, How are you today?");
		in.nextLine();
		System.out.println("Why is that?");
		Random rnd = new Random();
		while (true) {
			input = in.nextLine().split(" ");
			int randomNum = rnd.nextInt(2);
			if (randomNum == 0) {
				randomNum = rnd.nextInt(hedgeSet.size());
				output = new StringBuilder(hedgeSet.get(randomNum));
				if (randomNum == 2) {
					System.out.println(output);
					break;
				}
					
			} else {
				randomNum = rnd.nextInt(qualifierSet.size());
				output = new StringBuilder(qualifierSet.get(randomNum));
				output.append(" ");
				for (String x: input) {
					if (replacementMap.containsKey(x)) {
						output.append(replacementMap.get(x) + " ");
					} else {
						output.append(x + " ");
					}
				}
			}
			
			System.out.println(output);
		}
		System.out.println("Bye. See you again!!");
		in.close();
		
	}
	
}
