package session_attribute;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class session
 */
public class session extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action= request.getParameter("action");
		switch(action) {
		case "login":  request.getRequestDispatcher("login.jsp").forward(request, response); 
		               break;
		case "ind": request.getRequestDispatcher("index.jsp").forward(request, response); 
		               break;
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action= request.getParameter("action");
		switch(action) {
		case "logging": authenticate(request,response);
		                break;
		}
	}
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		if(username.equals("ajay") && password.equals("ajay123")) {
			request.getSession().invalidate();
			HttpSession session= request.getSession(true);
			session.setMaxInactiveInterval(300);
			session.setAttribute("username", username);
			String encode= response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/session_file?action=success");
		}
		else
		{
			String encode= response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/session?action=login");
		}
	}

}
