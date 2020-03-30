import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class View extends HttpServlet{
    void Display(String rno,String branch,HttpServletResponse response)   throws IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<html>" +
                    "<head><title> Information</title></head>" +
                    "<body>"+
                    "<h1>" + "The Roll Number "+rno+" belongs to "+branch+" Department"+
                     "</h1>" + 
                    "</body>"+
                    "</html>");
    }
}