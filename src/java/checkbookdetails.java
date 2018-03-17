/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Himagiri
 */
@Named(value = "checkbookdetails")
@RequestScoped
public class checkbookdetails {

   private String bookName;
   private HtmlOutputText bookId,bookCategory,bookPrice,bookAuthor;
    public checkbookdetails() {
    }
    public void Bookdetailsaction(ValueChangeEvent vce)
    {
        String s=vce.getNewValue().toString();
        String cid="",ccat="",caut="",cprice="";
        if(s.compareTo("Revolution 2020")==0)
        {
            cid="H-101";
            ccat="Novel";
            caut="Chetan Bhagat";
            cprice="$250";
        }
       else if(s.compareTo("ReIgnited")==0)
        {
            cid="H-102";
            ccat="Inspirational";
            caut="Dr.APJ ABDUL KALAM";
            cprice="$200";
        }
        else if(s.compareTo("Two States")==0)
        {
            cid="H-103";
            ccat="LoveStory";
            caut="Chetan Bhagat";
            cprice="$205";
        }
        getbookId().setValue(cid);
        getbookCategory().setValue(ccat);
        getbookAuthor().setValue(caut);
        getbookPrice().setValue(cprice);
    }
    public String getbookName()
    {
        return bookName;
    }
    public void setbookName(String bookName)
    {
        this.bookName=bookName;
    }
    public HtmlOutputText getbookId()
    {
        return bookId;
    }
    public void setbookId(HtmlOutputText bookId)
    {
        this.bookId=bookId;
    }
    public HtmlOutputText getbookCategory()
    {
        return bookCategory;
    }
    public void setbookCategory(HtmlOutputText bookCategory)
    {
        this.bookCategory=bookCategory;
    }
    public HtmlOutputText getbookAuthor()
    {
        return bookAuthor;
    }
    public void setbookAuthor(HtmlOutputText bookAuthor)
    {
        this.bookAuthor=bookAuthor;
    }
    public  HtmlOutputText getbookPrice()
    {
        return bookPrice;
    }
    public void setbookPrice(HtmlOutputText bookPrice)
    {
        this.bookPrice=bookPrice;
    }
}
