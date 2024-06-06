package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.dto.UsuarioDTO;

@WebServlet(name = "SVVerificarCodigo", urlPatterns = {"/SVVerificarCodigo"})
public class SVVerificarCodigo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        UsuarioDTO usuarioDTO = (UsuarioDTO) session.getAttribute("authcode");

        String code = request.getParameter("authcode");
        try (PrintWriter out = response.getWriter()) {
            if (code.equals(usuarioDTO.getCode())) {
                out.println("Verificación realizada");
            } else {
                out.println("Verificación incorrecta");
            }
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

