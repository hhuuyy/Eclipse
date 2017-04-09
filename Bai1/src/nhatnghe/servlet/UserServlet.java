package nhatnghe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user.php")
public class UserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String fullname = req.getParameter("hoten");
		req.setAttribute("fullname", fullname);
		//req.getRequestDispatcher("user.jsp").forward(req, resp);
		req.getRequestDispatcher("form.jsp").forward(req, resp);
	}
}
