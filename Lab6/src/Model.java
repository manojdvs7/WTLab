import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

public class Model extends HttpServlet{
    
    public void doGet(HttpServletRequest request, 
                        HttpServletResponse response) throws IOException{
        String rno = request.getParameter("Rno");
        Template t=new Template(rno);
        String branch=t.Decode();
        View v = new View();
        v.Display(rno,branch,response);
    }
}