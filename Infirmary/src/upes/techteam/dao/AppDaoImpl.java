package upes.techteam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import upes.techteam.models.Patient;
import upes.techteam.models.Stock;

public class AppDaoImpl implements AppDao {

	private DataSource dataSource;

	public AppDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean insertPatient(HttpServletRequest request) throws ParseException {
		String sql = "INSERT INTO Patient(date,name,age,gender,sapid,course,medicine,chronic_ailment,allergies,travel) VALUES (?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, request.getParameter("date"));
			ps.setString(2, request.getParameter("name"));
			ps.setInt(3, Integer.parseInt(request.getParameter("age")));
			ps.setString(4, request.getParameter("gender"));
			ps.setInt(5, Integer.parseInt(request.getParameter("sapid")));
			ps.setString(6, request.getParameter("course"));
			ps.setString(7, request.getParameter("medicine"));
			ps.setString(8, request.getParameter("chronic_ailment"));
			ps.setString(9, request.getParameter("allergies"));
			ps.setString(10, request.getParameter("travel"));
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("connection failed");
				}
			}
		}
	}

	@Override
	public List<Patient> getPatient() {
		String SQL = "Select * from Patient";
		List<Patient> listUsers = new ArrayList<Patient>();
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs =  ps.executeQuery();
	        while(rs.next()){
	        	Patient temp = new Patient(
	        			rs.getInt("Stuid"),
	        			rs.getString("date"),
	        			rs.getString("name"),
	        			rs.getInt("age"),
	        			rs.getString("gender"),
	        			rs.getInt("sapid"),
	        			rs.getString("course"),
	        			rs.getString("medicine"),
	        			rs.getString("chronic_ailment"),
	        			rs.getString("allergies"),
	        			rs.getString("travel")
	        			);
	        	listUsers.add(temp);
	        }
	     rs.close();
	     ps.close();
	     return listUsers;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally{
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {e.printStackTrace();}
			}
	}
	}

	@Override
	public List<Stock> getstock() {
		String SQL = "Select * from Stock";
		List<Stock> liststock = new ArrayList<Stock>();
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs =  ps.executeQuery();
	        while(rs.next()){
	        	Stock temp = new Stock(
	        			rs.getInt("MedId"),
	        			rs.getString("Medicine"),
	        			rs.getString("Amount")
	        			);
	        	liststock.add(temp);
	        }
	     rs.close();
	     ps.close();
	     return liststock;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally{
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {e.printStackTrace();}
			}
	}
	}
	}
