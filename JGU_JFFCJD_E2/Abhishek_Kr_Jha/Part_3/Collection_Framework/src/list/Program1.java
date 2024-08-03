/**
 * 
 */
package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * ArrayList
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(5);
		a.add("Abhishek");
		a.add(true);
		a.add(5.5);
		
		for (Object o : a) {
			System.out.println(o);
		}
		
		System.out.println("################################################");
		LinkedList l = new LinkedList();
		l.add(8);
		l.add("kumar");
		l.add(false);
		l.add(7.000);
		
		for (Object object : l) {
			System.out.println(l);
		}
		
		System.out.println("################################################");
		Vector v = new Vector();
		v.add(9);
		v.add("jha");
		v.add(true);
		v.add(3.2);
		
		for (Object object : v) {
			System.out.println(v);
		}
		
		System.out.println("################################################");
		Stack s = new Stack();
		s.add(2);
		s.add("Roushan");
		s.add(false);
		s.add(3);
		
		for (Object object : s) {
			System.out.println(s);
		}
		
		System.out.println("################################################");
		HashSet h = new HashSet();
		h.add(1);
		h.add("jigmet");
		h.add(true);
		h.add(4.0);
		
		for (Object object : h) {
			System.out.println(h);
		}
		
		System.out.println("###############################################");
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(9);
		lhs.add("Mritunjay");
		lhs.add(false);
		lhs.add(3.2);
		
		for (Object object : lhs) {
			System.out.println(lhs);
		}

	}

}
