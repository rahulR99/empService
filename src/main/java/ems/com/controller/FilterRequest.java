package ems.com.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterRequest implements Filter{
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
    ServletException
		{
			HttpServletResponse response = (HttpServletResponse) res;
			HttpServletRequest request = (HttpServletRequest) req;
			response.addHeader("Access-Control-Allow-Origin", "*");
			response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
			response.addHeader("Access-Control-Allow-Headers","Content-type");
			response.addHeader("Access-Control-Max-Age", "1800");
			chain.doFilter(request, res);
		}

public void destroy()
{
}

public void init(FilterConfig arg0) throws ServletException
{
}

}
