package com.ejercicio3.mf0227.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejercicio3.mf0227.accesodatos.UsuarioDaoTreeMap;
import com.ejercicio3.mf0227.pojo.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		UsuarioDaoTreeMap dao = UsuarioDaoTreeMap.getInstancia();

		Usuario u = dao.validarEmail(email);

		if (u == null || !u.getPass().equals(pass)) {
			request.setAttribute("mensaje", "Usuario o contraseña incorrecto");
			request.getRequestDispatcher("/WEB-INF/vistas/login.jsp").forward(request, response);
		} else {
			request.getSession().setAttribute("usuario", u);
			response.sendRedirect(request.getContextPath() + "/admin/index");
			// request.getRequestDispatcher("principal").forward(request, response);
		}
	}

}
