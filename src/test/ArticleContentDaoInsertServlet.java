package test;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.dao.ArticleContentDao;
import article.model.ArticleContent;
import jdbc.connection.ConnectionProvider;

/**
 * Servlet implementation class ArticleContentDaoInsertServlet
 */
@WebServlet("/ArticleContentDaoInsertServlet")
public class ArticleContentDaoInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleContentDaoInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArticleContent content = new ArticleContent(1, "content1");
		Connection conn = null;
		
		try {
			ArticleContentDao dao = new ArticleContentDao();
			
			conn = ConnectionProvider.getConnection();
			
			ArticleContent content2 = dao.insert(conn, content);
			
			System.out.println(content2.getNumber());
			System.out.println(content2.getContent());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
