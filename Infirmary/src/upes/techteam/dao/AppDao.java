package upes.techteam.dao;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import upes.techteam.models.Patient;
import upes.techteam.models.Stock;

public interface AppDao {

	public boolean insertPatient(HttpServletRequest request) throws ParseException;
	public List<Patient> getPatient();
	public List<Stock> getstock();
}
