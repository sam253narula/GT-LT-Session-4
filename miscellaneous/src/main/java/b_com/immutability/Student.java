package b_com.immutability;

import java.util.HashMap;
import java.util.Map;

public final class Student {
	private final String name;
	private final int rollNo;
	private final Map<String, String> metadata;

	public Student(String name, int rollNo, Map<String, String> metadata) {
		this.name = name;
		this.rollNo = rollNo;
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
		
	//	this.metadata = metadata;
	}

	public String getName() {
		return name;
	}

	public int getrollNo() {
		return rollNo;
	}

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}
