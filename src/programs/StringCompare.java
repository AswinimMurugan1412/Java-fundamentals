package programs;

public class StringCompare {

	public static void main(String[] args) {
	
				String str="Hello World";
				String anotherString="hello world";
				Object objStr=str;
				System.out.println(str.compareTo(anotherString));
				System.out.println(str.compareToIgnoreCase(anotherString));
				System.out.println(str.compareTo(objStr.toString()));                           //object  to string
			
	            String s1="google";        //normal memory
	            String s2="google";
	            String s3=new String("google");     //heap memory
	            System.out.println(s1.equals(s2));
	            System.out.println(s2.equals(s3));
	            System.out.println(s1==s2);
	            System.out.println(s2==s3);
            
	            String strOrig="Hello world,Hello Reader,Hello";
	            int lastIndex=strOrig.lastIndexOf("Hello");
	            if(lastIndex==-1) {
	            	System.out.println("Hello not found");
	            }
	            else {
	            	System.out.println("Last occurrennce of Hello is at index:" +lastIndex);
	            }
	            String string="abcdef";
	            String reverse=new StringBuffer(string).reverse().toString();
	            System.out.println("\nString before reverse:"+string);
	            System.out.println("String after reverse:"+reverse);
	            
	            
	            
	            String input="abcdef";
	            char[] try1=input.toCharArray();
	            for (int i=try1.length-1;i>=0;i--)
	            System.out.print(try1[i]);
	            }
	

	}


