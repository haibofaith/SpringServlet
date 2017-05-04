package com.demo.spring.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Lifecycle Listener implementation class SpringServletContextListener
 *
 */
@WebListener
public class SpringServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SpringServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // web应用在Web应用被服务器加载时创建IOC容器。servletContextListener初始化时创建
    	//  1.创建ioc容器 2.把ioc容器放在servletContext属性中
    	ServletContext sctx = arg0.getServletContext();
    	String configLocation = (String) sctx.getInitParameter("configLocation");
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);
    	//2.把ioc容器放在servletContext属性中
    	sctx.setAttribute("applicationContext", ctx);
    }
	
}
