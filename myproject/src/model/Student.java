package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;
@XmlRootElement(name="student")
public class Student {
	public Student(String sname) {
		super();
		this.sname = sname;
	}

	
	List<Batches> batches = new ArrayList<Batches>();

	String bcode,rollno,pwd, ccode, sname;

	public String getCcode()
	{  return  ccode; }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

  

    
    @XmlElement
    public String getSname()
	{  return  sname; }

	public void setBcode(String bcode)
	{
		  this.bcode = bcode;
    }

    public String getBcode()
    {
		  return bcode;
    }

    public void setRollno(String rollno)
	{
	  this.rollno = rollno;
	}

	public String getRollno()
	{
	  return rollno;
    }


	public void setPwd(String pwd)
	{
	  this.pwd = pwd;
    }

    public String getPwd()
    {
		  return pwd;
    }
}