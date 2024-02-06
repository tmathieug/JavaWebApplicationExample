package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")

	public class MyServlet2 extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String nombre = request.getParameter("nombre");

			out.println("<html>");
			out.println("<head>");
			out.println("<title>Bienvenida</title>");
			out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/styles2.css\">");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Bienvenido/a " + nombre + "!</h1>");
			out.println("</body></html>");
		}
	}
