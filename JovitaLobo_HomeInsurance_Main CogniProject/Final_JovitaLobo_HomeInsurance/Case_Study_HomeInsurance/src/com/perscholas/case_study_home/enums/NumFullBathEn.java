package com.perscholas.case_study_home.enums;

public enum NumFullBathEn {
	oneBath("1"),
	twoBath("2"),
	threeBath("3"),
	moreBath("more");
	
	private final String numFullBathName;
	private NumFullBathEn(String numFullBathName) {
	   this.numFullBathName = numFullBathName;
	}
	public String getNumFullBathValue() {
	   return numFullBathName;
	}
}
