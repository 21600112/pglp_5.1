package fr.uvsq.pglp_5_1;

import java.util.ArrayList;

public class PersonnelComposite implements PersonnelInterface{
	
	private ArrayList<PersonnelInterface> p;
	private final int id;
	private static int cpt = 0;
		
	public PersonnelComposite() {
		id = cpt++;
		p = new ArrayList<PersonnelInterface>();
	}
	
	public PersonnelComposite add(final PersonnelInterface i) {
		if(!p.contains(i))
			p.add(i);
		
		return this;
	}
	
	public PersonnelComposite remove(final PersonnelInterface i)
	{
		if(p.contains(i))
			p.remove(i);
		
		return this;
			
	}
	
	public void print()
	{
		for(PersonnelInterface i : p)
			i.print();
	}

}
