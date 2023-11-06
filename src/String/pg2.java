package String;

public class pg2 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2= new StringBuffer();
		StringBuffer s3=new StringBuffer("welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("abcdefghijklmnopqrstuvwxyz");
		System.out.println(s1.length());
		System.out.println(s1.length());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());

	}

}
