package Regular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular_ex2 {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("javaTraining",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Welcome JavaTraining");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");
		}
		
	}

}
