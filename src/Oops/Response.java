package Oops;
import java.util.ArrayList;
	public class Response {
		int id=0;
		String name;
		public Response(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public Response(int id) {
			this.id=id;
		}

	public static void main(String[] args) {
			ArrayList al=new ArrayList <Response>;
			al.add(new Response(1,"Ram"));
			al.add(new Response(2));

	}

}
