import java.util.regex.*;

public class Regular{

public static void main(String[] args) {

	String pattern = "[A-Za-z]+";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(check);
	
	while (m.find())
      	System.out.println( check.substring( m.start(), m.end() ) );
	}
}
