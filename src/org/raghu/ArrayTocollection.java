package org.raghu;

import java.util.List;
import java.util.Arrays;

public class ArrayTocollection {

	public static void main(String[] args) throws Exception {
		String[] a = new String[3];
		
		a[0] = "Hello";
		a[1] = "Cartoon";
		a[2] = "Hi";
		
		List<String> list1 = Arrays.asList(a);
		
		for(String b: list1)
		{
			System.out.println(b);
		}	
			
		
		
		

	}

}
