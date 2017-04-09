package nhatnghe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bonus.php")
public class BonusServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String hoten = req.getParameter("hoten");
		String luongS = req.getParameter("luong");
		int luong = Integer.parseInt(luongS);
		
		int thuong = luong * 10/100;
		
		req.setAttribute("hoten", hoten);
		req.setAttribute("luong", luong);
		req.setAttribute("thuong", thuong);
		req.getRequestDispatcher("bonus.jsp").forward(req, resp);
	}
}
