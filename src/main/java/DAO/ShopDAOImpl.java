package DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import Model.Vendor;

public class ShopDAOImpl  {
  private SessionFactory sf;
  
  public ShopDAOImpl() {
	super();
  }
  
  public SessionFactory getSf() {
	return sf;
  }

  public void setSf(SessionFactory sf) {
	this.sf = sf;
  }

  public boolean saveData(Vendor v)
  {System.out.println("In DAO\n");
	Session s=sf.openSession();
	s.beginTransaction();
	if(v!=null)
    {s.save(v);
	 s.getTransaction().commit();
	 s.close();
     return true;
    }
	else
	  return false;
   }
  public boolean removeData(int id)
   {
	Session s=sf.openSession();
	s.beginTransaction();
	Vendor v=(Vendor) s.get(Vendor.class,id);
	if(v!=null)
	   {s.delete(v);
	    s.getTransaction().commit();
	  //  System.out.println("Given Data is Deleted Sucessfully..");
	    return true;
	   }
	else
	   {
		//System.out.println("Data is not there..Please Check");
	    return false;
	   }
	
     		
   }
	public boolean updateData(int id,String name)
	{
	  Session s=sf.openSession();
	  s.beginTransaction();
	  Vendor v=(Vendor) s.get(Vendor.class,id);
	  if(v!=null)
	  {
	   v.setVname(name);
	   s.update(v);
	   s.getTransaction().commit();
	   return true;
	  }
	  else
	   return false;
	}
	public Vendor getData(int id)
	{
	 Session s=sf.openSession();
	 s.beginTransaction();
	 Vendor v=(Vendor) s.get(Vendor.class,id);
	 s.getTransaction().commit();
	 if(v!=null)
		 return v;
     else 
		 return null;
	}
}
