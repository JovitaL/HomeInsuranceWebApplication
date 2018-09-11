package com.perscholas.case_study_home.enums;

import com.perscholas.case_study_home.models.User;

public enum HomeStyleEn {
oneStory ("1 story"),
oneHalfStory("1.5 story"),
twoStory("2 story"),
twohalfStory("2.5 story"),
threeStory("3 story");

private final String homeStyleName;
private HomeStyleEn(String homeStyleName) {
   this.homeStyleName = homeStyleName;
}
public String getHomeStyleValue() {
   return homeStyleName;
}
}