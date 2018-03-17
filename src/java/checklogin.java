/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Himagiri
 */
@Named(value = "checklogin")
@RequestScoped
public class checklogin {

    private String UserId;
    private String Password;
    private String value;
    public checklogin() {
    }
    public String check()
    {
        if(getUserId().compareTo("himagirisai")==0 && getPassword().compareTo("password@123")==0)
        {
         return "true";
        }
        else
        {
            return "false";
        }
    }
    public String getUserId()
    {
        return UserId;
    }
    public void setUserId(String UserId)
    {
        this.UserId=UserId;
    }
    public String getPassword()
    {
        return Password;
    }
    public void setPassword(String Password)
    {
        this.Password=Password;
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value=value;
    }
}
