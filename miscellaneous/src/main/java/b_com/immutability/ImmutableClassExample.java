package b_com.immutability;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClassExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		Student s = new Student("ABC", 101, map);
		System.out.println(s.getName());
		System.out.println(s.getrollNo());
		System.out.println(s.getMetadata());

		// Uncommenting below line causes error
		// s.rollNo = 102;

		map.put("3", "third");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor

		s.getMetadata().put("4", "fourth");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in getter
	}
}
