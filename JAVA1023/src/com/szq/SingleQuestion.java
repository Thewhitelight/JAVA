package com.szq;

public class SingleQuestion extends Question {
	/** ��¼������ѡ�� */
	String answer;
	boolean ok=true;
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}
	@Override
	protected boolean check(String answers) {
		// TODO Auto-generated method stub
		MutliQuestion mutliquestion=new MutliQuestion();
		mutliquestion.getAnswers();

		if (answers.equals(mutliquestion.getAnswers().subSequence(0, 1))) {
			return ok;
		}
		return ok=false;
	}
}
