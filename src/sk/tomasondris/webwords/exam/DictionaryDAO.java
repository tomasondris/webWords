package sk.tomasondris.webwords.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "dictionaryDAO")
@SessionScoped
public class DictionaryDAO {
	
	private List<String> wordsLection1Loaded;
	private List<String> wordsLection2Loaded;

	public DictionaryDAO () {
		wordsLection1Loaded = new ArrayList<String>();
		wordsLection2Loaded = new ArrayList<String>();
		
		wordsLection1Loaded.add("Sample word 1");
		wordsLection1Loaded.add("Sample word 2");
		wordsLection1Loaded.add("Sample word 3");
		wordsLection1Loaded.add("Sample word 4");
		wordsLection1Loaded.add("Sample word 5");
		wordsLection1Loaded.add("Sample word 6");
		wordsLection1Loaded.add("Sample word 7");
		wordsLection1Loaded.add("Sample word 8");
		wordsLection1Loaded.add("Sample word 9");
		wordsLection1Loaded.add("Sample word 10");

		wordsLection2Loaded.add("Sample word lection2 1");
		wordsLection2Loaded.add("Sample word lection2 2");
		wordsLection2Loaded.add("Sample word lection2 3");
		wordsLection2Loaded.add("Sample word lection2 4");
		wordsLection2Loaded.add("Sample word lection2 5");
		wordsLection2Loaded.add("Sample word lection2 6");
		
		System.out.println("zinicializoval som slovniky: " + wordsLection1Loaded.size() + " a " + wordsLection2Loaded.size());
		
	}
	
	public String getRandomWord (int lection) {
		
		if (lection == 1) {
			return wordsLection1Loaded.get(randInt(0, wordsLection1Loaded.size()-1));
		}
		else if (lection == 2) {
			return wordsLection2Loaded.get(randInt(0, wordsLection2Loaded.size()-1));
		}
		
		return null;
	}
	
	private int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}	

}
