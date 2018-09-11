package com.perscholas.case_study_home.bo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.perscholas.case_study_home.dao.PolicyDAO;
import com.perscholas.case_study_home.models.Location;
import com.perscholas.case_study_home.models.Policy;
import com.perscholas.case_study_home.models.Property;
import com.perscholas.case_study_home.models.Quote;

public class PolicyBO {
	private int PolicyNum;
	private Date policy_start_date; // DATE
	private Date policy_end_date; // DATE
	private Date policy_end_date_util;
	private double policy_term;
	private String policy_status;
	private int quote_id_Policy;

	public Policy insertPolicyByStartDate(java.sql.Date date, java.util.Date d, Quote q) {
		PolicyDAO poliDAO = new PolicyDAO();
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime(); // date which you give inside this brackets should be java.util.date
		cal.add(Calendar.DATE, 60);
		Date addedSixty = cal.getTime();// getTime() will give the value after modification ie after adding 60 days
		if (d.after(today) && d.before(addedSixty)) { // entered Policydate should be between todays date within 60 days
														// period
			cal.setTime(d);
			cal.add(Calendar.YEAR, 1);
			policy_end_date_util = cal.getTime();
			policy_end_date = new java.sql.Date(policy_end_date_util.getTime());
			policy_start_date = date;
			policy_term = 1;
			policy_status = "ACTIVE";
			Policy p = new Policy(policy_start_date, policy_end_date, policy_term, policy_status, q.getQuote_id());
			PolicyNum = poliDAO.insertPolicyByStartDate(p);
			p.setPolicy_number(PolicyNum);
			return p;
		} else {
			return null;
		}
	}

	public Policy retrieveInsertPolicyByStartDate(java.sql.Date date, java.util.Date d, int quoteid) {
		PolicyDAO poliDAO = new PolicyDAO();
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime(); // date which you give inside this brackets should be java.util.date
		cal.add(Calendar.DATE, 60);
		Date addedSixty = cal.getTime();// getTime() will give the value after modification ie after adding 60 days
		if (d.after(today) && d.before(addedSixty)) { // entered Policydate should be between todays date within 60 days
														// period
			cal.setTime(d);
			cal.add(Calendar.YEAR, 1);
			policy_end_date_util = cal.getTime();
			policy_end_date = new java.sql.Date(policy_end_date_util.getTime());
			policy_start_date = date;
			policy_term = 1;
			policy_status = "ACTIVE";
			Policy p = new Policy(policy_start_date, policy_end_date, policy_term, policy_status, quoteid);
			PolicyNum = poliDAO.insertPolicyByStartDate(p);
			p.setPolicy_number(PolicyNum);
			return p;
		} else {
			return null;
		}
	}
}