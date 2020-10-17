package new_Calcalator;

import java.util.ArrayList;
import java.util.List;

public class RomeToArabic {
    public  int romeToArabic(String rome){
        List<Integer> list = new ArrayList<>();

        int resOne = 0;

        for (int i = 0; i < rome.length(); i++) {
            for (RomanNumber pair : RomanNumber.values()) {
                String ch = String.valueOf(rome.charAt(i));
                if (pair.name().equals(ch)) {
                    list.add(pair.getNumArabic());
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1 && list.get(i) < list.get(i + 1)) {
                resOne = list.get(i + 1) - list.get(i);
                i++;
            } else {
                resOne += list.get(i);
            }
        }
        return  resOne;
    }
}
