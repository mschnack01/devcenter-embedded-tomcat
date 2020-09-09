package servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


import java.io.IOException;


/*
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(
        name = "MyServlet", 
        urlPatterns = {"/hello"}
    )

*/


@Path("/")

public class HelloServlet /* extends HttpServlet*/ {

    @GET
    public Response defaultGetMethod(){
        return Response.status(200).type("text/html").entity("Welcome to DIS exam 2019. Good luck!").build();
    }

    /*

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write("hello heroku".getBytes());
        out.flush();
        out.close();
    }

    */
    
}
