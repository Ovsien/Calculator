package new_Calcalator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArabicHandler implements Handler{
    private Pattern pattern;

    public void setPattern(Pattern pattern){
        this.pattern = pattern;
    }

    public String execute(String arabic){
        Matcher matcher = pattern.matcher(arabic);

        matcher.matches();

        int a = Integer.parseInt(matcher.group(1));
        int b = Integer.parseInt(matcher.group(3));

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new RuntimeException("Попробуй числа от 1 до 10");
        }
        String result = null;

        switch (matcher.group(2)) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case "/":
                result = String.valueOf(a / b);
                break;
        }

        return result;
    }
}
