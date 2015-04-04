package sk.tomasondris.webwords.exam;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "sessionData")
@SessionScoped
public class WebWordsSession {
	
	private int lection;
	private String word;
	private ExamObject exam;

	public WebWordsSession () {
		this.exam = new ExamObject();
		System.out.println("instancujem examobject v kontexte sessny..");
	}
	
	public ExamObject getExam() {
		return exam;
	}

	public void setExam(ExamObject exam) {
		this.exam = exam;
	}

	public String getWord() {
		return word;
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
