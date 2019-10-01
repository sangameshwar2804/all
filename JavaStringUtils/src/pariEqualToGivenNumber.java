import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pariEqualToGivenNumber {

	 static void process(String target) {
		    String longest = "";
		    for (int i = 0; i < target.length(); i++) {
		      String check = target.substring(i);
		      for (int pos = 0; pos < (check.length() / 2) + 1; pos++) {
		        String part = check.substring(0, pos);
		        String regex = part + ".?" + new StringBuilder(part).reverse().toString();
		        Pattern pattern = Pattern.compile(regex);
		        Matcher matcher = pattern.matcher(check);
		        if (matcher.find()) {
		          String word = matcher.group();
		          if (word.length() > longest.length()) {
		            longest = word;
		          }
		        }
		      }
		    }
		    System.out.println(longest);
		  }
public static void main(String[] args) {
	process("abcbe");
}
}
