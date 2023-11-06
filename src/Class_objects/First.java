package Class_objects;

public class First {

		int num1=10,num2=20 ,result;
		public void add() {
			result=num1+num2;
			System.out.println(result);
		}
			public void sub() {
				result=num1-num2;
				System.out.println(result);
			}
					
			void multi() {
				result=num1*num2;
				System.out.println(result);
			}

          void div() {
	      result=num1/num2;
	       System.out.println(result);
}
			public static void main(String[] args) {
				Data d= new Data();
			    d.display();
			
				First f=new First();
				f.add();
				f.sub();
				f.multi();
				f.div();
				
		
	}
}


