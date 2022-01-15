package Testautomation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Collection {
	public static void main(String[] args) {
//		ArrayList li = new ArrayList();
//		li.add(1);
//		li.add("Velocity");
//		li.add('a');
//		li.add("Velocity");
//		li.add(null);
//		
//		for(int i=0; i<li.size();i++) {
//			System.out.println(li.get(i));
//		}
		
//		Iterator liIterator = li.iterator();
//		while(liIterator.hasNext()) {
//			System.out.println(liIterator.next());
//		}
		
		LinkedList ll =new LinkedList();
		ll.add("Velo");
		ll.add(1);
		ll.add('a');
		ll.add(null);
		ll.add(1);
//		for(int i=0; i<ll.size();i++) {
//			System.out.println(ll.get(i));
//			}
		Iterator lliterator= ll.iterator();
		while(lliterator.hasNext()) {
			System.out.println(lliterator.next());
		}
		
//		
//		PriorityQueue<String> q =new PriorityQueue<String>();
//		q.add("Velocity");
//		q.add("Velocity");
//		q.add("katraj");
//		Iterator i = q.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		 HashSet h =new HashSet();
//		 h.add("Velocity");
//		 h.add("Velocity");
//		 h.add("Katraj");
//		 
//		 Iterator i1 =h.iterator();
//		 while(i.hasNext()) {
//			 System.out.println(i.next());
//		 }
//		
//		HashMap<String, String> hmap = new HashMap<String, String>();
//		hmap.put("name", "Shubham");
//		hmap.put("Batch", "OctB");
//		hmap.put(null, null);
//		hmap.put(null,"Katraj");
//		
//		System.out.println(hmap.get(null));
//		
//		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();
//		htable.put(1, "Velocity");
//		htable.put(2, "Velocity");
//		htable.put(3,"OctB");
//		
//		
//		System.out.println(htable.get(1));
//		System.out.println(htable.get(2));
//		System.out.println(htable.get(3));
//		
//		
	}
}
