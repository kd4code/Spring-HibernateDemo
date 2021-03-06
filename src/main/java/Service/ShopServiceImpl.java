package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.ShopDAO;
import DAO.ShopDAOImpl;
import Model.Vendor;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDAO sd;
	
	public ShopServiceImpl() {
		super();
	}
	public ShopDAO getSd() {
		return sd;
	}
	public void setSd(ShopDAO sd) {
		this.sd = sd;
	}
	
	
	public boolean saveData(Vendor v)
	{  System.out.println("In Service");
       return sd.saveData(v);
	}
	public boolean removeData(int id)
	{
      return sd.removeData(id);
	}
	public boolean updateData(int id,String name)
	{
	  return sd.updateData(id, name);	
	}
	public Vendor getData(int id)
	{
	  return sd.getData(id);	
	}
	
	

}
