package fr.uvsq.pglp_5_1;

import java.io.Serializable;
import java.util.ArrayList;

public class DaoPersonnel implements Dao<Personnel>,Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Personnel> list;
	
	public DaoPersonnel()
	{
		list = new ArrayList<Personnel>();
	}
	
	public void add(final Personnel object)
	{
		list.add(object);
	}
	
	public Personnel get(int id)
	{
		for(Personnel p:list)
			if(p.getId()==id)
				return p;
		return null;
	}
	
	public void update(Personnel p)
	{
		Personnel pTransi = this.get(p.getId());
	}
	
	public void remove(Personnel p)
	{}
	
}
