package com.perscholas.case_study_home.bo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.perscholas.case_study_home.dao.RetrieveQuoteDAO;

import com.perscholas.case_study_home.models.RetrieveQuote;

public class RetrieveQuoteBO {
	public List<RetrieveQuote> RetrieveAllQuoteByUser(String user_id) throws SQLException, IOException {
		RetrieveQuoteDAO retquoDAO = new RetrieveQuoteDAO();
		List<RetrieveQuote> retquoList = retquoDAO.RetrieveAllQuoteByUser(user_id);
		return retquoList;
	}
}