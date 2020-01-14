package upes.techteam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

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
}
