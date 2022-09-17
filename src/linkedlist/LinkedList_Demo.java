package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
//		LinkedList <Integer> ll = new LinkedList<Integer>();
//		LinkedList <String>	ll = new LinkedList<String>();
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add("sokoeurn");
		ll.add(null);
		ll.add(true);
		ll.add(34.10);
		ll.add('S');
		
		System.out.println(ll);
		System.out.println(ll.size());
		
		ll.remove(5);
		System.out.println(ll);
		
		ll.remove(true);
		System.out.println(ll);
		
		ll.add(2,"Chhay");
		System.out.println(ll);
		
		ll.add(0, 34);
		System.out.println(ll);
		
		System.out.println( ll.get(3));
		
		ll.set(4, "Surname");
		System.out.println(ll);
		
		System.out.println(ll.contains("Im"));
		System.out.println(ll.contains("Surname"));
		
		System.out.println(ll.isEmpty());
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		for(Object value: ll) {
			System.out.println(value);
		}
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		LinkedList ll_family = new LinkedList();
		ll_family.add("sokoeurn");
		ll_family.add("chhay");
		ll_family.add("kosal");
		ll_family.add("im");
		
		LinkedList new_ll = new LinkedList();
		new_ll.addAll(ll_family);
		System.out.println(new_ll);
		
//		new_ll.removeAll(ll_family);
//		System.out.println(new_ll);
		
//		Collections.sort(ll_family);
//		System.out.println(ll_family);
		
//		Collections.sort(ll_family, Collections.reverseOrder());
//		System.out.println(ll_family);
		
//		Collections.shuffle(ll_family);
//		System.out.println(ll_family);
		
		ll_family.addFirst("Davy");
		System.out.println(ll_family);
		
		ll_family.addLast("chhay");
		System.out.println(ll_family);
		
		System.out.println( ll_family.getFirst());
		System.out.println( ll_family.getLast());
		
		System.out.println( ll_family.removeFirst());
		System.out.println( ll_family.removeLast());
		
		System.out.println(ll_family);
		
		
		
		
		

	}

}
