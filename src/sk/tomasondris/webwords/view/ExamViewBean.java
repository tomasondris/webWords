package sk.tomasondris.webwords.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import sk.tomasondris.webwords.exam.WebWordsSession;

@ManagedBean(name = "examView")
@ViewScoped
public class ExamViewBean {

	@ManagedProperty(value="#{sessionData}")
	private WebWordsSession webWordsSession;
	private String inputWordValue;
	private int inputLectionValue;

	@PostConstruct
	public void init() {
		
		if (getWebWordsSession().getLection() == 0) {
			getWebWordsSession().setLection(1);
			System.out.println("nastavujem lekciu");
			
		}
		else {
			System.out.println("lekcia je nastavena..");
		}
		
		webWordsSession.getExam().setLection(webWordsSession.getLection());
		inputWordValue = webWordsSession.getExam().getWord();
	}
	
	/** Actions */
	public void checkWordAction () {
			System.out.println("chcem vediet, ci je to spravne ..");
	}
			
	public void generateNextWordAction () {
			System.out.println("zmenil som na nove slovicko");
	}	
	
	/** Getters and Setters */
	public String getInputWordValue() {
		return inputWordValue;
	}

	public void setInputWordValue(String inputWordValue) {
		this.inputWordValue = inputWordValue;
	}		

	public int getInputLectionValue() {
		return inputLectionValue;
	}

	public void setInputLectionValue(int inputLectionValue) {
		this.inputLectionValue = inputLectionValue;
	}

	public WebWordsSession getWebWordsSession() {
		return webWordsSession;
	}

	public void setWebWordsSession(WebWordsSession webWordsSession) {
		this.webWordsSession = webWordsSession;
	}
}
