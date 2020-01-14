package upes.techteam.dao;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

public interface AppDao {

	public boolean insertPatient(HttpServletRequest request) throws ParseException;
}
