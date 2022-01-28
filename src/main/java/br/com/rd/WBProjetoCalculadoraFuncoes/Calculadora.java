package br.com.rd.WBProjetoCalculadoraFuncoes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		if((request.getParameter("val1") != null) && (request.getParameter("val2") != null)) {
			//leitura de parametros
			int var1 = Integer.parseInt(request.getParameter("val1"));
			int var2 = Integer.parseInt(request.getParameter("val2"));
			
			//chamada da regra de negocio
			Calcular calc = new Calcular(var1,var2); 
			int resultado;
			
			
			if(request.getParameter("btnSomar") != null) {
				 resultado = calc.somar();
			} else if (request.getParameter("btnSub") != null) {
				 resultado = calc.subtrair();
			}else if (request.getParameter("btnMulti") != null) {
				 resultado = calc.multiplicar();
			}else {
				resultado = calc.dividir();
			}
			
			//resultado da regra de negocio
			request.setAttribute("resultado", resultado); //requestScope - forward
	
		}
		request.getRequestDispatcher("/").forward(request, response); // rediciona para ele mesmo 
	} 
}


