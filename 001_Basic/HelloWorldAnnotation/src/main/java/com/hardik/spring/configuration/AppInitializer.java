package com.hardik.spring.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Application Initializer
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AppInitializer implements WebApplicationInitializer {

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

// UPDATE: Note that now you can write the above class even more concisely [and
// it’s the preferred way], by extending
// AbstractAnnotationConfigDispatcherServletInitializer base class, as shown
// below:
// class AppInitializerA extends
// AbstractAnnotationConfigDispatcherServletInitializer {
// @Override
// protected Class<?>[] getRootConfigClasses() {
// return new Class[] { AppConfiguration.class };
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
