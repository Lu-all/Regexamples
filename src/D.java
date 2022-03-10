import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("(?:(?:C\\/)|(?:Calle)) ([A-Z]\\w+),?\\s*(?:(?:Nº)|(?:N *)|(?:Nº *)|(?:n))?(\\d+), *(\\d{5})");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group(3)+"-"+m.group(1)+"-"+m.group(2));
        }
    }
}