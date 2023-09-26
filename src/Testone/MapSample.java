package Testone;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapSample {
public static void main(String[] args) {
	Map<String, Integer> m= new TreeMap<String, Integer>();
	m.put("java", 10);
	m.put("frame", 30);
	m.put("github", 20);
	m.put("maven", 50);
	m.put("datadriven", 70);
	int i=m.get("frame");
	int b=m.get("github");
	System.out.println(b);
	Set<String> k=m.keySet();
	System.out.println(k);
	for (String st : k) {
		System.out.println(st);
	}
	Set<Entry<String, Integer>> entryset=m.entrySet();
	System.out.println(entryset);
	for (Entry<String, Integer> e : entryset) {
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	}
}
}
