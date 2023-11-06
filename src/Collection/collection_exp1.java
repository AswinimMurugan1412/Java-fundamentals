package Collection;
import java.util.*;
public class collection_exp1 {

	public static void main(String[] args) {
		ArrayList<Comparable>alist=new ArrayList<Comparable>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		alist.add(3);
		alist.add(12.0);
		System.out.println(alist);
		alist.remove("Steve");
		alist.remove("Angela");
		System.out.println(alist);
		alist.remove(2);
		alist.add(1,"Harshtita");
		alist.add(4,"Jasmine");
		System.out.println(alist);
        System.out.println(alist.size());
	}

}
