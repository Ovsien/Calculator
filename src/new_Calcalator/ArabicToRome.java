package new_Calcalator;

public class ArabicToRome {
    public String arabicToRome(int arabic){
        StringBuilder resultRome = new StringBuilder();

        for (RomanNumber pair : RomanNumber.values()){
            if (arabic >= pair.getNumArabic()) {
                int resultNum = arabic / pair.getNumArabic();
                arabic = arabic - resultNum * pair.getNumArabic();

                if (resultNum > 3) {
                    RomanNumber prev = RomanNumber.values()[pair.ordinal() - 1];
                    resultRome.append(pair.name()).append(prev.name());
                } else {
                    resultRome.append(pair.getMultyName(resultNum));
                }
            }
        }

        return resultRome.toString();
    }
}
