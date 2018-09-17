package com.javatpoint;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aiswarya
 */
public class LoginBean {
    private String name,password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    boolean validate() {
       
        if(password.equals("admin"))
                {
                    return true;
                }
        else{
            return false;
        }
    }

}