package com.woniu.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.woniu.po.PageBean;

/**
 * Servlet implementation class RoleAction
 */
@WebServlet("/goods.action")
public class GoodsAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PageBean pb = new PageBean();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsAction() {
        super();
        
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
