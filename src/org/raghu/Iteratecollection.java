package org.raghu;
import java.util.Collection;

import java.util.Iterator;

public class Iteratecollection {

	public void printCollection(Collection<String> c)
	{
		
		Iterator<String> i = c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
