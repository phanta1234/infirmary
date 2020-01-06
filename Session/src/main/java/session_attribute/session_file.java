package session_attribute;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class session_file
 */
public class session_file extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public session_file() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action= request.getParameter("action");
		switch(action) {
		case "success": request.getRequestDispatcher("success.jsp").forward(request, response);
		                break;
		case "member" : request.getRequestDispatcher("member.jsp").forward(request, response);
                        break;
		         
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result= request.getParameter("action");
		switch(result) {
		
		case "destroy":
			request.getSession().invalidate();
			String encode= response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/session?action=ind");
		}
	}

}
