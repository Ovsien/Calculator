package new_Calcalator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    private final Pattern pattern;
    private final Handler handler;

    public StringValidator(String regex, Handler handler){
        this.pattern = Pattern.compile(regex);
        handler.setPattern(this.pattern);
        this.handler = handler;
    }

    public Handler getHandler(){
        return this.handler;
    }

    public boolean validate(String str){
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
