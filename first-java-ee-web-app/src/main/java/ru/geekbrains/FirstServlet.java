package ru.geekbrains;
import javax.servlet.*;
import java.io.IOException;


public class FirstServlet implements Servlet {
    private transient ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("<h1>Hello from Servlet1</h1>");
    }

    @Override
    public String getServletInfo() {
        return "FirstServlet";
    }

    @Override
    public void destroy() {

    }
}
