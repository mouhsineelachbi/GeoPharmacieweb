package Servelet;
import GeoPharmacie.Client;
import GeoPharmacie.baseD;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ModifierClient", urlPatterns = {"/ModifierClient"})
public class ModifierClient extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        baseD op = new baseD();
        String action = request.getParameter("action");
        if(action.equals("ModifierClient")){
            int numeroclient =Integer.parseInt(request.getParameter("numeroclient"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String cin = request.getParameter("cin");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String adresse = request.getParameter("adresse");
            String pseudo = request.getParameter("pseudo");
            String motdepasse =request.getParameter("motdepasse");
            Client c;
                  c = new Client();
                  c.setNom(nom);
                  c.setPrenom(prenom);
                  c.setCin(cin);
                  c.setEmail(email);
                  c.setTel(tel);
                  c.setAdresse(adresse);
                  c.setPseudo(pseudo);
                  c.setNumClient(numeroclient);
                  c.setMotDePasse(motdepasse);
            request.setAttribute("Client", c);
            ServletContext context= getServletContext();
            RequestDispatcher rd= context.getRequestDispatcher("/ModifierClient.jsp");
            rd.forward(request, response);
        }
        if(action.equals("modifier")){
            int numeroclient =Integer.parseInt(request.getParameter("numeroclient"));
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String cin = request.getParameter("cin");
            String email = request.getParameter("email");
            String tel = request.getParameter("tel");
            String adresse = request.getParameter("adresse");
            String pseudo = request.getParameter("pseudo");
            String motdepasse=request.getParameter("motdepasse");
            Client c = new Client();
                  c.setNom(nom);
                  c.setPrenom(prenom);
                  c.setCin(cin);
                  c.setEmail(email);
                  c.setTel(tel);
                  c.setAdresse(adresse);
                  c.setPseudo(pseudo);
                  c.setNumClient(numeroclient);
                  c.setMotDePasse(motdepasse);
                  op.modifierClient(numeroclient, nom, prenom, cin, tel, email, adresse, pseudo, motdepasse);
                  request.setAttribute("Client", c);
                ServletContext context= getServletContext();
                RequestDispatcher rd= context.getRequestDispatcher("/MesInformations.jsp");
                rd.forward(request, response);
                   System.out.println("***********************dans action=modifier************************************ modifierClient.java avant la redirection");
                  response.sendRedirect("MesInformations.jsp");
                  System.out.println("***********************dans action=modifier************************************ modifierClient.java apres la redirection");
        }
       
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ModifierClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ModifierClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
