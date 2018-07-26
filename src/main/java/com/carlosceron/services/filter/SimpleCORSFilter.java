package com.carlosceron.services.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleCORSFilter implements Filter{
	
	private final Logger log = LoggerFactory.getLogger(SimpleCORSFilter.class);
	
	public SimpleCORSFilter() {
		log.info("SimpleCORSFilter Iniciando");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		
		HttpServletRequest request = (HttpServletRequest) req;
        System.out.println("CORSFilter HTTP Request: " + request.getMethod());
 
        // Authorize (allow) all domains to consume the content
        ((HttpServletResponse) res).addHeader("Access-Control-Allow-Origin", "*");
        ((HttpServletResponse) res).addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
        ((HttpServletResponse) res).addHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");
 
        HttpServletResponse resp = (HttpServletResponse) res;
 
        // For HTTP OPTIONS verb/method reply with ACCEPTED status code -- per CORS handshake
        if (request.getMethod().equals("OPTIONS")) {
            resp.setStatus(HttpServletResponse.SC_ACCEPTED);
            return;
        }
 
        // pass the request along the filter chain
        chain.doFilter(request, res);
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
