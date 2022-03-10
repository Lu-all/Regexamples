import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("C[^ ]* (\\w+)\\s(?:[^\\d]*)?(\\d+), (\\d+)");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}