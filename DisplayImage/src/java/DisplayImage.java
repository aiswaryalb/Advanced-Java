/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aiswarya
 */
public class DisplayImage extends HttpServlet {
    
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        response.setContentType("image/jpeg");
        ServletOutputStream out;
        out=response.getOutputStream();
        FileInputStream fin=new FileInputStream("g:\\flower.jpg");
        
        BufferedInputStream bin=new BufferedInputStream(fin);
        BufferedOutputStream bout=new BufferedOutputStream(out);
        int ch=0;
        while((ch=bin.read())!=-1)
        {
            bout.write(ch);
        }
        bin.close();
        fin.close();
        bout.close();
        out.close();
        
    }

}