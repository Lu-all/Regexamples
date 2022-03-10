import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("(E?(-|\\s)?(\\d\\d\\d\\d)(-|\\s)?)([A-Z]{3})");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}