package org.encap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee extends EncapSulation {

	public static void main(String[] args) {


		Employee e1=new Employee();
		e1.setEmpId(1000);
		e1.setEmpName("arun");
		e1.setEmpPhNo(9566372393l);

		Employee e2=new Employee();
		e2.setEmpId(1001);
		e2.setEmpName("rahul");
		e2.setEmpPhNo(7010898297l);

		Employee e3=new Employee();
		e3.setEmpId(10002);
		e3.setEmpName("raja");
		e3.setEmpPhNo(733782308l);

		List<Employee> li=new ArrayList<Employee>();
		li.add(e1);
		li.add(e2);
		li.add(e3);

		for(int i=1; i<li.size();i++) {

			System.out.println(li.get(i).getEmpId());
			System.out.println(li.get(i).getEmpName());
			System.out.println(li.get(i).getEmpPhNo());

		}

/*	Set<Employee> s=new HashSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);

		for (Employee employee : s) {
			System.out.println(employee.getEmpId());
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpPhNo());
		}
		 */

		/*Map<String,Employee> m=new LinkedHashMap<String,Employee>();
		m.put("rahul", e1);
		m.put("thalavai", e2);
		m.put("vijay", e3);

	Set<Entry <String,Employee>> a = m.entrySet();

for (Entry<String, Employee> entry : a) {

	System.out.println(" Employee Information " + entry.getKey());
	System.out.println(entry.getValue().getEmpId());
	System.out.println(entry.getValue().getEmpName());
	System.out.println(entry.getValue().getEmpPhNo());


}



	}*/

	}}
