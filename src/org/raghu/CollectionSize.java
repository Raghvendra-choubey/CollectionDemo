package org.raghu;

import java.util.*;

public class CollectionSize {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();

		li.add("mayank");
		li.add("nitin");
		li.add("prince");
		li.add("shashank");
		li.add("ashish");
		li.add("aman");

		if (li.isEmpty()) {
			System.out.println("Collection is empty");

		} else {
			System.out.println("Collection size is " + li.size());

		}

	}

}
