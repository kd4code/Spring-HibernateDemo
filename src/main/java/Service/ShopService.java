package Service;

import Model.Vendor;

public interface ShopService {
	public boolean saveData(Vendor v);
	public boolean removeData(int id);
	public boolean updateData(int id,String name);
	public Vendor getData(int id);
}
