package Linkedlist;
import java.util.*;
public class linkedlist_ex1 {

	public static void main(String[] args) {
	LinkedList<String>linkedlist=new LinkedList<String>();
	linkedlist.add("Item1");
	linkedlist.add("Item5");
	linkedlist.add("Item3");
	linkedlist.add("Item6");
	linkedlist.add("Item2");
	linkedlist.add("Item1");
	System.out.println("LInked list content: "+linkedlist);
	
	linkedlist.addFirst("First Item");
	linkedlist.addLast("Last Item");
	System.out.println("LInked list after addition: "+linkedlist);
	Object firstvar=linkedlist.get(0);
	System.out.println("First element: "+firstvar);
	linkedlist.set(0," Changed first item");
	Object firstvar2=linkedlist.get(0);
	System.out.println("First element after update by set method: "+firstvar2);
	linkedlist.removeFirst();
	linkedlist.removeLast();
	System.out.println("LinkedList after deleting of first and last element:" + linkedlist);
	linkedlist.add(0,"Newly added item");
	linkedlist.remove(2);
		System.out.println("Final content:"+ linkedlist);
		Object str=linkedlist.clone();
		System.out.print(str);
		/*linkedlist.poll();
		System.out.println(linkedlist);
		linkedlist.pollFirst();
		linkedlist.pollLast();*/
		linkedlist.removeFirstOccurrence("Item1");
		System.out.println(linkedlist);
		linkedlist.removeLastOccurrence("Item1");
		System.out.println(linkedlist);
	}
	}
    
