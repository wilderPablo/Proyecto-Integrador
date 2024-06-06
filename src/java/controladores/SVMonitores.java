package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ProductosDAO;

@WebServlet(name = "SVMonitores", urlPatterns = {"/SVMonitores"})
public class SVMonitores extends HttpServlet {

    ProductosDAO prodao = new ProductosDAO();
    List<ProductosDAO> Monitores =new ArrayList<>();
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        Monitores = prodao.listarMonitores();
        if(accion!=null){
            
        }else{
            request.setAttribute("Monitores", Monitores);
            request.getRequestDispatcher("./vista/Monitores.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
