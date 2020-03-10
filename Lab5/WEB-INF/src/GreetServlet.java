import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class GreetServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, 
                        HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        String rno = request.getParameter("Rno");
        StringTokenizer st1 = new StringTokenizer(rno, "-");
        String decode[] = new String[4];
        int i=0;
        String branch="";
            
            while (st1.hasMoreTokens()){ 
             decode[i]=st1.nextToken();
             i++;
            }
        if(decode[2].equals("732"))
            branch="Civil";
        else if(decode[2].equals("733"))
            branch="Computer Science";
        else if(decode[2].equals("734"))
            branch="Electronics and communication Engineering";
        else if(decode[2].equals("735"))
            branch="Electrical Engineering";
        else if(decode[2].equals("736"))
            branch="Mechanical Engineering";
        else if(decode[2].equals("737"))
            branch="Information Technology";
        else
            branch="Unknown";
                out.println("<html>" +
                    "<head><title> Greetings..</title></head>" +
                    "<body>"+
                    "<h1>" + "The Roll Number "+rno+" belongs to "+branch+" Department"+
                     "</h1>" + 
                    "</body>"+
                    "</html>");
    }
}