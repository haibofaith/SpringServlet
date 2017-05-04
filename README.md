# SpringServlet
Servlet结合Spring使用

1.如果新建web项目没自动生成web.xml</br>
项目／java ee tools／Generate ...</br>

2.Spring如何在web应用中使用</br>
1.需要额外jar包</br>
2.Spring的配置文件</br>
3.Spring如何创建IOC容器</br>
1)非web应用在main方法中直接创建。</br>
2)web应用在Web应用被服务器加载时创建IOC容器。servletContextListener初始化时创建</br>
3)在web应用的其他组件中如何访问？servletcontext的属性中，application域中。</br>

3.遇到一个问题：解决方案获取web.xml中属性，需按照如下方法：</br>
ServletContext sctx = arg0.getServletContext();</br>
String configLocation = (String) sctx.getInitParameter("configLocation");</br>



