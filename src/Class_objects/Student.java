package Class_objects;

class Data{
	int studID=101;
	String studName="jasmine";
	 public void display() {
System.out.println("stud ID:"+studID);
System.out.println("stud Name:"+studName);

	}
}
public class Student {

	public static void main(String[] args) {
    Data d= new Data();
    d.display();

	}

}
