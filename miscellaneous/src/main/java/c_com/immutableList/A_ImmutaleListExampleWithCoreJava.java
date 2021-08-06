package c_com.immutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Collections.unmodifiableList creates a wrapper around the same existing List such that
the wrapper cannot be used to modify it. However we can still change original List.  */

public class A_ImmutaleListExampleWithCoreJava {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Great");

		// Create ImmutableList from List using copyOf()
		List<String> iList = Collections.unmodifiableList(list);
		//iList =list; 
		// We change List and the changes reflect in iList.
		list.add("Learners");
		list.add("Work Hard");
     	iList.add("try it");

		System.out.println(iList);
	}
}
