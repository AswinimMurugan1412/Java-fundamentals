package Regular;
import java.util.regex.*;

public class regular_ex4 {

	public static void main(String[] args) {
	Pattern p=Pattern.compile(".s");
	Matcher m=p.matcher("as");
	boolean b=m.matches();
	//boolean b2=Pattern.compikle(".s").matcher("as").matches();
	//boolean b3=Pattern.matches(".s","as");
	System.out.println(b+"");

	}

}
