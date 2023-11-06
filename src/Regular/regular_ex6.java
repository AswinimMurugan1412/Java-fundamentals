package Regular;
import java.util.regex.*;

public class regular_ex6 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkvarun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2UK2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2"));

	}

}
