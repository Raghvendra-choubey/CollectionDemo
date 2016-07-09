package org.raghu;

import java.util.*;

public class HashMapDemo {

	public void pritHashMap(Iterator i)
	{
		while(i.hasNext())
		{
			Map.Entry<String, String> e = (Map.Entry<String, String>)i.next();
			System.out.println(e.getKey()+ " : " +e.getValue());
		}
		
	}
}
