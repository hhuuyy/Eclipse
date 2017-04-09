package nhatnghe.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hcn.php")
public class HCNServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cd = req.getParameter("cd");
		String cr = req.getParameter("cr");
		int dientich = Integer.parseInt(cd) * Integer.parseInt(cr);
		int chuvi = (Integer.parseInt(cd) + Integer.parseInt(cr)) *2;
		req.setAttribute("chuvi", chuvi);
		req.setAttribute("dientich", dientich);
		req.getRequestDispatcher("hcn.jsp").forward(req, resp);
	}
}
