package sk.tomasondris.webwords.exam;

import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

public class ExamObject implements IExamObject {

	private DictionaryDAO dictionary;
	private String word;
	private int lection;

	public ExamObject () {
		this.dictionary = new DictionaryDAO();
		System.out.println("ziskal som instanciu slovnika");
	}
		
	public String getWord() {
		return dictionary.getRandomWord(lection);
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getLection() {
		return lection;
	}

	public void setLection(int lection) {
		this.lection = lection;
	}
	
}
