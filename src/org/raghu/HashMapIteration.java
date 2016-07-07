package org.raghu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "kunal");
		hm.put("2", "sunil");
		hm.put("3", "anuj");
		hm.put("4", "sharad");
		hm.put("5", "rahul");

		Iterator i = hm.entrySet().iterator();

		while (i.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) i.next();

			System.out.println(pair.getKey() + " : " + pair.getValue());
		}

	}

}
