package new_Calcalator;

import java.util.regex.Pattern;

public interface Handler {
    void setPattern(Pattern pattern);

    String execute(String str);
}
