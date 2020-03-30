import java.io.*;
import java.util.*;

public class Template
{
    String rno;
    public Template(String rno)
    {
        this.rno=rno;
        
    }
    public String Decode()
    {
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
        return branch;
    }
}