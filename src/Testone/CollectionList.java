package Testone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionList {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mp=new LinkedHashMap<Integer, String>();
		
		mp.put(30, "Java");
		mp.put(20, "Selenium");
		mp.put(80, "frame");
		mp.put(60, "jenkins");
		mp.put(50, "git");
		mp.put(20, "pojo");
		
		System.out.println(mp);
		
		String string = mp.get(60);
		System.out.println(string);
		
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		for (Integer c : keySet) {
			
			System.out.println(c);
			
		}
		
		Collection<String> values = mp.values();
		System.out.println(values);
		
		for (String v : values) {
			
			System.out.println(v);
			
		}
		
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> m : entrySet) {
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		
		
	}

}
