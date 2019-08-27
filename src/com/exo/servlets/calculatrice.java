package com.exo.servlets;

import java.io.IOException;
import com.exo.beans.operation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculette")
public class calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	operation ope;


    public calculatrice() {
        super();
        ope = new operation();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.ope.setReponse("");
		this.ope.setSigneOperation(request.getParameter("signe"));
		this.ope.setValeur1(request.getParameter("val1"));
		this.ope.setValeur2(request.getParameter("val2"));

		request.setAttribute("resultat", this.ope);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request,response);
		
	}

}
