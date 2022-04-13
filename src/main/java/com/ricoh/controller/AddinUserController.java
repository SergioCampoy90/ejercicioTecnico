package com.ricoh.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ricoh.services.SendEmail;
import com.ricoh.services.Services;
import com.ricoh.services.CaptchaService;

@WebServlet(urlPatterns = "/addinData")
public class AddinUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Services catServ;
	SendEmail emailServ;
	CaptchaService verifyCaptcha;

	public AddinUserController() {
		super();
		catServ = new Services();
		emailServ = new SendEmail();
		verifyCaptcha = new CaptchaService();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String date = request.getParameter("date");
		String email = request.getParameter("email");
		String destinatario = email;
		String asunto = "Registro prueba tecnica";
		String cuerpo = "Te has registrado correctamente en nuestros servicios.";
		
		try {
				this.catServ.redirigirAccion(action, name, surname, date, email);	
				RequestDispatcher rd = request.getRequestDispatcher("addinData.jsp");	
				rd.forward(request, response);
				SendEmail.enviarConGMail(destinatario, asunto, cuerpo);						
			}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		doGet(request, response);

	}
	
}
