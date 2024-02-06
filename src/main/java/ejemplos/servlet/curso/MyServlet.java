package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Ejemplo Formulario Servlet</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"/styles.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
		out.println("<h3>Ejemplo Formulario Servlet</h3>");
		out.println("<form action=\"/myServlet2\" method=\"post\">");
		out.println("<label for=\"nombre\">Nombre:</label>");
		out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\"><br><br>");
		out.println("<input type=\"submit\" value=\"Enviar\"><br>");
		out.println("</form>");
		out.println("</div>");
		out.println("</body></html>");
	}

}