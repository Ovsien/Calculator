package new_Calcalator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        List<StringValidator> list = new ArrayList<>();
        list.add(new StringValidator("^(\\d+)\\s*([+\\-*/])\\s*(\\d+)$", new ArabicHandler()));
//        list.add(new StringValidator("^([IVXLCDM]+)\\s*([+\\-*/])\\s*([IVXLCDM]+)$", new RomanHandler()));
        list.add(new StringValidator("(m/\\b((?:M{0,3}?(?:D?C{0,3}|C[DM])?(?:L?X{0,3}|X[LC])?(?:I{0,3}?V?I{0,3}|I[VX])))\\b/gs.)\\s*([+\\-*/])\\s*(m/\\b((?:M{0,3}?(?:D?C{0,3}|C[DM])?(?:L?X{0,3}|X[LC])?(?:I{0,3}?V?I{0,3}|I[VX])))\\b/gs.)$", new RomanHandler()));

        StringValidator validator = null;

        for (StringValidator s : list){
            if (s.validate(str)){
                validator = s;
                break;
            }
        }
        if (validator == null){
            throw new RuntimeException();
        }

        System.out.println(validator.getHandler().execute(str));
    }
}
