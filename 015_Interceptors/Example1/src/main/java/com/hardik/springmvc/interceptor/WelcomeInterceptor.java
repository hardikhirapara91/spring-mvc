package com.hardik.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Welcome Interceptor
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class WelcomeInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeInterceptor.class);

	/**
	 * PRE
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		logger.info("WelcomeInterceptor.preHandle() method executed.");
		return true;
	}

	/**
	 * POST
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		logger.info("WelcomeInterceptor.postHandle() method executed.");
	}

	/**
	 * AFTER
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.info("WelcomeInterceptor.afterCompletion() method executed.");
	}

}
