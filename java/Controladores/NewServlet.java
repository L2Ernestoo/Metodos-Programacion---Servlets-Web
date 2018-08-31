/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Calculadora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Calculadora calculadora = new Calculadora();

        String secue = request.getParameter("secuencia30");
        String secuene = request.getParameter("7secuenega");
        String press = request.getParameter("10prestecla");
        String nombre = request.getParameter("nombre");
        int numpares = Integer.parseInt(request.getParameter("1par"));
        int produnum1 = Integer.parseInt(request.getParameter("2product1"));
        int produnum2 = Integer.parseInt(request.getParameter("2product2"));
        int may3_1 = Integer.parseInt(request.getParameter("3may1"));
        int may3_2 = Integer.parseInt(request.getParameter("3may2"));
        int may4_1 = Integer.parseInt(request.getParameter("4may1"));
        int may4_2 = Integer.parseInt(request.getParameter("4may2"));
        int may4_3 = Integer.parseInt(request.getParameter("4may3"));
        int tablamult = Integer.parseInt(request.getParameter("5tablamult"));
        int prosum8_1 = Integer.parseInt(request.getParameter("8prosum1"));
        int prosum8_2 = Integer.parseInt(request.getParameter("8prosum1"));
        int div9_1 = Integer.parseInt(request.getParameter("9div1"));
        int div9_2 = Integer.parseInt(request.getParameter("9div2"));
        
        String[] secuencia = secue.split(" ");
        String[] secuencianega = secuene.split(" ");
        String[] press_10_dat = press.split(" ");
        
        
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href='https://fonts.googleapis.com/css?family=Nunito' rel='stylesheet'>");
            out.println("<link rel='stylesheet' href='estilos.css' />");
            out.println("<title>Resultados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='formulario'>");
            out.println("<div id='titulo'>Bienvenido " + nombre + "</div>");
            out.println("<form name='form'>");
            out.println("<h2>1. Numero par o impar</h2>");
            out.println(calculadora.pares(numpares));
            out.println("<h2>2. Producto dos numeros</h2>");
            out.println(calculadora.produs(produnum1, produnum2));
            out.println("<h2>3. Numero mayor(Dos Numeros)</h2>");
            out.println(calculadora.nummay(may3_1, may3_2));
            out.println("<h2>4. Numero mayor(Tres Numeros)</h2>");
            out.println(calculadora.nummay3(may4_1, may4_2, may4_3));
            out.println("<h2>5. Tabla Multiplicar</h2>");
            out.println(calculadora.tablamult(tablamult));
            out.println("<h2>6. Secuencia 30 Numeros - Suma y Producto</h2>");
            out.println(calculadora.produsum(secuencia));
            out.println("<h2>7. Sumar hasta negativo encontrado</h2>");
            out.println(calculadora.septima_opcion_negativo(secuencianega));
            out.println("<h2>8. Producto mediante sumas</h2>");
            out.println(calculadora.prosum(prosum8_1, prosum8_2));
            out.println("<h2>9. Division Mediante Restas</h2>");
            out.println(calculadora.divirest(div9_1, div9_2));
            out.println("<h2>10. Producto hasta presionar tecla</h2>");
            out.println(calculadora.decima_opcion_producto(press_10_dat));
            out.println("</form>");
            out.println("<div id='creditos'></div>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
