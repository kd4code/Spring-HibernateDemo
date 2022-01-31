package DAO;

import Model.Vendor;

public interface ShopDAO {
	public boolean saveData(Vendor v);
	public boolean removeData(int id);
	public boolean updateData(int id,String name);
	public Vendor getData(int id);
}
