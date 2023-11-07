import java.io.*;
import java.util.*;


public class Postfix {

    public Postfix() {
    }


    public int calculate(String input1) throws FileNotFoundException {
        //File file = new File("in.txt");
        String input = input1;
        Stack<Integer> calc = new Stack<Integer>();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int x = 0;
                int y = 0;
                int r = 0;
                if (Character.isDigit(c)) {
                    int t = Character.getNumericValue(c);
                    calc.push(t);
                } else if (c == '+') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x + y;
                    calc.push(r);
                } else if (c == '-') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x - y;
                    calc.push(r);
                } else if (c == '*') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x * y;
                    calc.push(r);
                } else if (c == '/') {
                    x = calc.pop();
                    y = calc.pop();
                    r = x / y;
                    calc.push(r);
                } else if (c == '%'){
                    x = calc.pop();
                    y = calc.pop();
                    r = x % y;
                    calc.push(r);
                }
            }
        int a = calc.pop();
        return a;
    }
}
