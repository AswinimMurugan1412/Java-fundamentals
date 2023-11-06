package Regular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regular_ex3 {

	public static void main(String[] args) {
		String line="This order was placed for QT3000!OK?";
		Pattern pattern=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher matcher=pattern.matcher(line);
		while(matcher.find()){
			System.out.println("group 1:" +matcher.group(1));
			System.out.println("group 2:" +matcher.group(2));
			System.out.println("group 3:" +matcher.group(3));
		}

	}

}
