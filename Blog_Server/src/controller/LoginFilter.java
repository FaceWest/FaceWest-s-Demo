package controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * 访问权限控制的过滤器
 */
@WebFilter(urlPatterns= {"*.jsp","*.s"})
//检测括号内指定的页面地址,使用URLpattern添加多个字符串
public class LoginFilter implements Filter {

   
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		HttpServletRequest httpRequest =(HttpServletRequest) request;
		String passth = httpRequest.getServletPath();//返回访问资源路径
		System.out.println(passth);
		System.out.println(httpRequest.getSession().getAttribute("loginedUser"));
		if(passth.endsWith("login.jsp")||passth.endsWith("user.s")) {
			chain.doFilter(request, response);
			return;
		}
		if(httpRequest.getSession().getAttribute("loginedUser") !=null) {
			//已经登录
			//执行过滤器链,放行
			chain.doFilter(request, response);
		}else {
			request.setAttribute("msg", "请先登录！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
