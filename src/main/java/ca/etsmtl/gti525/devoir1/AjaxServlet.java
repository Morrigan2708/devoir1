/*Servlet qui fait l’affichage de la liste des images, qui peut recevoir une requête AJAX pour l’affichage du fragment des détails.
  Code modifié par Amaury Trassaert, dans le cadre du cours GTI525, hiver 2017
 */

package ca.etsmtl.gti525.devoir1;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ImageIcon;


public class AjaxServlet extends HttpServlet {
	private Collection collection = new Collection();
	private static final long serialVersionUID = -8308514275340556375L;
	
	public AjaxServlet(){
		super();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		
		
		
			}

			
}
