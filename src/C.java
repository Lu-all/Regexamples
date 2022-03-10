import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("(?:[a-z]\\.([a-z]{2,})\\.(\\d{4})@alumnos\\.urjc\\.es)|(?:([a-z]+)\\.([a-z]+)@urjc\\.es)");
        Matcher m = p.matcher(text);
        while (m.find()) {
            if (m.group(1) != null && !m.group(1).isEmpty()) {
                System.out.println("alumno " + m.group(1)+ " matriculado en " + m.group(2));
            } else {
                System.out.println("profesor " + m.group(3) + " " + m.group(4));
            }
        }
    }
}