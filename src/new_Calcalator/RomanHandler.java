package new_Calcalator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanHandler implements Handler{
    private Pattern pattern;

    @Override
    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public String execute(String roman) {
        Matcher matcher = pattern.matcher(roman);

        matcher.matches();

        String romeNumOne = matcher.group(1);
        String romeNumTwo = matcher.group(3);

        RomeToArabic conv = new RomeToArabic();

        int arOne = conv.romeToArabic(romeNumOne);
        int arTwo = conv.romeToArabic(romeNumTwo);

        ArabicToRome arToRom = new ArabicToRome();

        if (arOne < 1 || arOne > 10 || arTwo < 1 || arTwo > 10) {
            throw new RuntimeException("Попробуй числа от I до X");
        }
        int result = 0;

        switch (matcher.group(2)) {
            case "+":
                result = (arOne + arTwo);
                break;
            case "-":
                result = (arOne - arTwo);
                break;
            case "*":
                result = (arOne * arTwo);
                break;
            case "/":
                result = (arOne / arTwo);
                break;
        }
        if (result < 0){
            throw new RuntimeException("У римских числен нет отрицательных чисел");
        }
        return arToRom.arabicToRome(result);
    }
}
