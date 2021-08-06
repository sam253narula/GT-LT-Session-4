package c_com.immutableList;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class B_ImmutaleListExampleWithGoogleGuava {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Time");

		// Create ImmutableList from List using copyOf()
		ImmutableList<String> iList = ImmutableList.copyOf(list);
		// We change List and the changes wont reflect in iList.
		list.add("is too slow");
		list.add("for those who wait");

		System.out.println(iList);
	}
}
