package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.yc.dao.BeanUtils;

import Bean.User;
import biz.BizException;
import biz.UserBiz;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user.s")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserBiz ubiz = new UserBiz();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if("login".equals(op)) {
			login(request,response);
		}else if("query".equals(op)) {
			query(request,response);
		}else if("add".equals(op)) {
			add(request,response);
		}else if("find".equals(op)) {
			find(request,response);
		}
	}

	
	

	private void find(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setCharacterEncoding("utf-8");
			String id = request.getParameter("id");
			User user = ubiz.find(id);
			//将user类的数据转成JSON格式的数据
			String userString = JSON.toJSONString(user);
			System.out.println(userString);
			//将数据返回给页面
			response.getWriter().append(userString);			
	}




	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserBiz ubiz = new UserBiz();
		//将参数加载到user对象中
		User user = BeanUtils.asBean(request, User.class);
		try {
			ubiz.add(user);
		} catch (BizException e) {
			
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			
		}finally {
			query(request, response);
		}
		
	}




	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = BeanUtils.asBean(request, User.class);
		request.setAttribute("userList", ubiz.find(user));
		request.getRequestDispatcher("manage-user.jsp").forward(request, response);
		
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");

		User user = null;
		try {
			user = ubiz.login(username, userpwd);
			System.out.println(user);
		} catch (BizException e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		if(user == null ) {
			request.setAttribute("msg", "用户名或密码错误！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else {
			//保存用户信息
			request.getSession().setAttribute("loginedUser", user);
			response.sendRedirect("index.jsp");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
