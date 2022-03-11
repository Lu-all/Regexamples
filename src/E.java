import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pattern p = Pattern.compile("\\d\\d:\\d\\d:\\d\\d\\.\\d\\d\\d ([A-Z]+) \\d+ +-+ +\\[([a-z]+)\\] (?:\\w+\\.)*([a-zA-z]+) : (.+)");
        while(s.hasNextLine()) {
            String text = s.nextLine();
            Matcher m = p.matcher(text);
            while (m.find()) {
                System.out.println("\"" + m.group(1) + "\",\"" + m.group(2) + "\",\"" + m.group(3) + "\",\"" + m.group(4) + "\"");
            }
        }
    }
}
