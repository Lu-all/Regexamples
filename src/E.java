import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        Pattern p = Pattern.compile("([A-Z]+).*\\[(\\w+)][\\sa-z.]*([A-Z][\\w]*)\\s*:\\s*(.+)");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("\""+m.group(1)+"\",\""+m.group(2)+"\",\""+m.group(3)+"\",\""+m.group(4)+"\"");
        }
    }
}