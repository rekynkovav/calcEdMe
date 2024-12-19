import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(calc(bufferedReader.readLine()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String calc(String input) throws Exception {

        String[] arrayStr = input.split(" ");
        int x = Integer.parseInt(arrayStr[0]);
        int x2 = Integer.parseInt(arrayStr[2]);
        char c = arrayStr[1].charAt(0);
        String result = "";
        if (x < 0 || x > 10 && x2 < 0 || x2 > 11 && input.length() > 3) {
           throw  new Exception();
        }else{
            switch ((int) c) {
                case 43:
                    result = x + x2 + "";
                    break;
                case 42:
                    result = x * x2 + "";
                    break;
                case 45:
                    result = x - x2 + "";
                    break;
                case 47:
                    result =  x / x2 + "";
                    break;
            }
        }
        return result;
    }
}