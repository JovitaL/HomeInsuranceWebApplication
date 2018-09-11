package com.perscholas.case_study_home.enums;

public enum NumHalfBathEn {
	oneHalfBath("1"),
	twoHalfBath("2"),
	threeHalfBath("3"),
	moreHalfBath("more");
	
	private final String numHalfBathName;
	private NumHalfBathEn(String numHalfBathName) {
	   this.numHalfBathName = numHalfBathName;
	}
	public String getNumHalfBathValue() {
	   return numHalfBathName;
	}	
}