import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("([a-z]{1}\\.[a-z]{2,}\\.\\d{4}@alumnos\\.urjc\\.es)|([a-z]+\\.[a-z]+@urjc\\.es)");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}