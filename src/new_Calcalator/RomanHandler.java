package new_Calcalator;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanHandler implements Handler {
    Pattern pattern;

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    String result = null;

    public String execute(String roman){
            Matcher matcher = pattern.matcher(roman);

            matcher.matches();

            int s1 = Integer.parseInt(matcher.group(1));
            int s2 = Integer.parseInt(matcher.group(3));

            Map<String, Integer> map = new HashMap<>();
            map.put("X", 10);
            map.put("V", 5);
            map.put("I", 1);


        switch (matcher.group(2)) {
            case "+":
                result = String.valueOf(s1 + s2);
                break;
            case "-":
                result = String.valueOf(s1 - s2);
                break;
            case "*":
                result = String.valueOf(s1 * s2);
                break;
            case "/":
                result = String.valueOf(s1 / s2);
                break;
        }


            return result;
    }
}
