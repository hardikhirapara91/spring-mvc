package com.hardik.spring.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Web Application Initializer (Web.xml)
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AppInitializer implements WebApplicationInitializer {

	/**
	 * Start UP
	 */
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfiguration.class);
		context.setServletContext(container);

		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(context));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}

// Note that above class can be written even more concisely [and it's the
// preferred way], by extending
// AbstractAnnotationConfigDispatcherServletInitializer base class, as shown
// below:
// public class HelloWorldInitializer extends
// AbstractAnnotationConfigDispatcherServletInitializer {
// @Override
// protected Class<?>[] getRootConfigClasses() {
// return new Class[] { HelloWorldConfiguration.class };
// }
// @Override
// protected Class<?>[] getServletConfigClasses() {
// return null;
// }
// @Override
// protected String[] getServletMappings() {
// return new String[] { "/" };
// }
// }
