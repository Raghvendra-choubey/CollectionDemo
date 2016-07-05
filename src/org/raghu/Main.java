package org.raghu;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> h = new ArrayList<String>();
		
		h.add("kunal");
		h.add("sunil");
		h.add("anuj");
		h.add("hemant");
		h.add("sharad");
		h.add("jitendra");
		h.add("rahul");
		h.add("vipin");

		Iteratecollection i = new Iteratecollection();
		System.out.println(h.size());
		System.out.println("");
		
		i.printCollection(h);
		
		h.remove("vipin");
		h.remove("hemant");
		
		Collections.reverse(h);
		
		System.out.println("");
		System.out.println(h.size());
		System.out.println("");
		i.printCollection(h);
		
				
		
		
		
		
	}

}
