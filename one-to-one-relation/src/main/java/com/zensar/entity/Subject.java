package com.zensar.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Subject {
	private String firstSubject;
	private String secondSubject;
	private String thirdSubject;
	private String fourthSubject;
	private String fifthSubject;

	public Subject() {
		super();
	}

	public Subject(String firstSubject, String secondSubject, String thirdSubject, String fourthSubject,
			String fifthSubject) {
		super();
		this.firstSubject = firstSubject;
		this.secondSubject = secondSubject;
		this.thirdSubject = thirdSubject;
		this.fourthSubject = fourthSubject;
		this.fifthSubject = fifthSubject;
	}

	public String getFirstSubject() {
		return firstSubject;
	}

	public void setFirstSubject(String firstSubject) {
		this.firstSubject = firstSubject;
	}

	public String getSecondSubject() {
		return secondSubject;
	}

	public void setSecondSubject(String secondSubject) {
		this.secondSubject = secondSubject;
	}

	public String getThirdSubject() {
		return thirdSubject;
	}

	public void setThirdSubject(String thirdSubject) {
		this.thirdSubject = thirdSubject;
	}

	public String getFourthSubject() {
		return fourthSubject;
	}

	public void setFourthSubject(String fourthSubject) {
		this.fourthSubject = fourthSubject;
	}

	public String getFifthSubject() {
		return fifthSubject;
	}

	public void setFifthSubject(String fifthSubject) {
		this.fifthSubject = fifthSubject;
	}

	@Override
	public String toString() {
		return "Subject [firstSubject=" + firstSubject + ", secondSubject=" + secondSubject + ", thirdSubject="
				+ thirdSubject + ", fourthSubject=" + fourthSubject + ", fifthSubject=" + fifthSubject + "]";
	}

}
