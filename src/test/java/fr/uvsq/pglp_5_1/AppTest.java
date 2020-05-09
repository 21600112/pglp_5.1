package fr.uvsq.pglp_5_1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import fr.uvsq.pglp_5_1.Personnel.Builder;
import fr.uvsq.pglp_5_1.PersonnelComposite;
import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{

	@Test
	public void testId() {
		ArrayList<String> numTel = new ArrayList<String>();
		numTel.add("06");
		
		Builder b = new Builder(1,"coo","kie","mangeurPro",LocalDate.of(1998, 1, 1),numTel);
		
		Personnel p = b.build();
		
		assertEquals(p.getId(),1);
	}
	
	@Test
	public void testComposite() {
		ArrayList<String> numTel = new ArrayList<String>();
		numTel.add("06");
		
		Builder b = new Builder(1,"coo","kie","mangeurPro",LocalDate.of(1998, 1, 1),numTel);
		
		Personnel pe = b.build();
		
		PersonnelComposite pc = new PersonnelComposite();
		
		pc.add(pe);
		pc.remove(pe);
		assertEquals(pc.p.size(), 0);
	}

	
}