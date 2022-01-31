package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Model.Vendor;
import Service.ShopService;

@Controller
public class ShopControllerImpl {
    @Autowired
	private ShopService ss;
	
	
	public ShopControllerImpl() {
		super();
	}
	
	public ShopService getSs() {
		return ss;
	}

	public void setSs(ShopService ss) {
		this.ss = ss;
	}

	public boolean saveData(Vendor v)
	{System.out.println("\nIn controller");
	  boolean b=ss.saveData(v);
	  if(b==true)
		  {System.out.println("\nData Saved Successfully..");
		   return b; 
		  }
	  else
	      { System.out.println("\nData is not saved ..Please try again");
	        return b;
	      }
	}
	public boolean removeData(int id)
	{
		boolean b=ss.removeData(id);
		  if(b==true)
			  {System.out.println("\nData Removed Successfully..");
			   return b; 
			  }
		  else
		      { System.out.println("\nData doesn't exist ..Please try again");
		        return b;
		      }	
	}
	public boolean updateData(int id,String name)
	{
		boolean b=ss.updateData(id, name);
		  if(b==true)
			  {System.out.println("\nData updated Successfully..");
			   return b; 
			  }
		  else
		      { System.out.println("\nData doesn't exist ..Please try again");
		        return b;
		      }	
	}
	public Vendor getData(int id)
	{
	  Vendor v=ss.getData(id);
	  if(v!=null)
		   return v;
	  else
	  {System.out.println("\nData doesn't exist..");
	   return null;
	  } 
	}
}
