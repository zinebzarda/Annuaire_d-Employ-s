package web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private Map<String, String> credentials;

    public login() {
        super();
        credentials = new HashMap<>();
        credentials.put("admin1", "pw1");
        credentials.put("admin2", "pw2");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String login = request.getParameter("login");
        String passw = request.getParameter("pw");

        if (credentials.containsKey(login) && credentials.get(login).equals(passw)) {
            session.setAttribute("login", login);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("employee.jsp");
        }
    }
}
