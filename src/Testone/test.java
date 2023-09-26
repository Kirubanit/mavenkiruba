package Testone;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		EncapsulationTest T1 = new EncapsulationTest();
		T1.setName("kiruba");
		T1.setAge(25);
		T1.setPhoneno(960095648);
		EncapsulationTest T2 = new EncapsulationTest();
		T2.setName("abc");
		T2.setAge(26);
		T2.setPhoneno(1234656789);
		List<EncapsulationTest> li = new ArrayList<EncapsulationTest>();
		li.add(T1);
		li.add(T2);
		for (int i = 0; i < li.size(); i++) {
System.out.println(li.get(i).getName());
		}
	}
}
