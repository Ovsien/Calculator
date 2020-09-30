package old_Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        Character c = null;

        for(int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            try {
                Integer.parseInt(String.valueOf(str.charAt(i)));
                if (c == null) {
                   a.append(ch);
                } else {
                    b.append(ch);
                }
            } catch (NumberFormatException var9) {
                if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
                    if (ch != ' ') {
                        throw new RuntimeException("Нет такой операции");
                    }
                } else {
                    if (c != null) {
                        throw new RuntimeException("Попробуй сложить два числа");
                    }

                    c = ch;
                }
            }
        }
        int num1 = Integer.parseInt(a.toString());
        int num2 = Integer.parseInt(b.toString());

            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10){
                throw new RuntimeException("Попробуй числа от 1 до 10");
        }


        switch (c) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}
