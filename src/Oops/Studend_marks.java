package Oops;
class Base1{
	int stud_id;
	String stud_name;
	void getInfo(int id,String name) {
		stud_id=id;
		stud_name=name;
	}
	void putInfo() {
		System.out.println("Employee Id:"+stud_id);
		System.out.println("Employee name:"+stud_name);		  
	}
}
class Derived1 extends Base1{
	int mark1,mark2,mark3,average,sum;
	void getInfo1(int m1, int m2, int m3) {
		getInfo(101,"Aswini");
		mark1=m1;
		mark2=m2;
		mark3=m3;
		 
		
	}
	void putInfo1() {
		putInfo();
		//System.out.println("MARK1:"+mark1);
		//System.out.println("MARK2:"+mark2);
		//System.out.println("MARK3:"+mark3);
		sum=mark1+mark2+mark3;
		System.out.println("Total:"+sum);
	    average=sum/3; 
	    System.out.println("Average:"+average);
	}
} 


public class Studend_marks {

	public static void main(String[] args) {
		Derived1 d=new Derived1();
		d.getInfo1(99, 80, 72);
		d.putInfo1();
		
		
		
		

	}

}
