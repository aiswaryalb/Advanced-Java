/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Aiswarya
 */
public class CubeNumber extends TagSupport {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }
    public int doStartTag()throws JspException
    {
        JspWriter out=pageContext.getOut();
        try {
            out.print(number*number*number);
            
        } 
        catch (Exception e) {e.printStackTrace();
        }
        
                return SKIP_BODY;

    }
    
    
}
