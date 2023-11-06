package Variable;

public class Student_Constructor {
	int stud_id;
	String stud_name;              //instance veriable
	String College;
	public  Student_Constructor() {
		stud_id=101;
		stud_name="sathish";
		College="abcd engineering college";
		System.out.println(stud_id);
		System.out.println(stud_name);
		System.out.println(College);	
	}
	public Student_Constructor(int id,String name,String col) {
		//parameterized constructor
		System.out.println(id);
		System.out.println(name);
		System.out.println(col);
	}
	

	public static void main(String[] args) {
		
		Student_Constructor sc=new Student_Constructor();	

		Student_Constructor sc1=new Student_Constructor(102,"ganga","MERIT");
		
	}
	

	}

