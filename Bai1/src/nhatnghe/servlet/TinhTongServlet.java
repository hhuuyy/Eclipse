package nhatnghe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate.php")
public class TinhTongServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String a = req.getParameter("a");
		String b = req.getParameter("b");
		//String tong = a + b;
		int tong = Integer.parseInt(a) + Integer.parseInt(b);
		req.setAttribute("tong", tong);
		req.getRequestDispatcher("maytinh.jsp").forward(req, resp);
	}
}
