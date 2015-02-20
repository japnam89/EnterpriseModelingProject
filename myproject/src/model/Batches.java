package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;
@XmlRootElement(name="batches")
public class Batches {
	
	List<Student> students = new ArrayList<Student>();

	public  String ccode,stdate;

    public  void setCcode(String ccode)
    { 
    	this.ccode= ccode; 
    	}
   @XmlElement
    public String geCcode()
    {  return ccode; }


    public  void setStdate(String stdate)
	    { this.stdate= stdate; }
       
	    public String geStdate()
    {  return stdate;
    }
	    
	    
}