/*Servlet qui fait l’affichage de la liste des images, qui peut recevoir une requête AJAX pour l’affichage du fragment des détails.
  Code modifié par Amaury Trassaert, dans le cadre du cours GTI525, hiver 2017
 */

package ca.etsmtl.gti525.devoir1;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;


public class AjaxServlet extends HttpServlet {
	private Collection collection = new Collection();
	private static final long serialVersionUID = -4865099303373864286L;
	
	public AjaxServlet(){
		super();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Collection collection = new Collection();
		if (!(request.getParameter("listeImages") == "" || request.getParameter("listeImages") == null)) {

			Integer idPhoto = Integer.parseInt(req.getParameter("listeImages"));
			Photo photo = collection.getPhoto(idPhoto);

			response.setContentType("text/html");

			request.setAttribute("photo", photo);
			request.setAttribute("dossierVignettes", getServletConfig().getInitParameter("dossierVignettes"));

			RequestDispatcher RequetsDispatcherObj = getServletContext().getRequestDispatcher("/details.jsp");
			RequetsDispatcherObj.include(request, response);

		} else {
			if (request.getParameter("listeImages") != null) {
				if (request.getParameter("listeImages").isEmpty() || request.getParameter("listeImages") == "") {
					RequestDispatcher RequetsDispatcherObj = getServletContext().getRequestDispatcher("/error.jsp");
					RequetsDispatcherObj.forward(request, response);
				}
			} else {
				request.setAttribute("collection", collection.getImages());

				RequestDispatcher RequetsDispatcherObj = getServletContext().getRequestDispatcher("/collection.jsp");
				RequetsDispatcherObj.forward(request, response);
			}
		}
		
		
			}

			
}
