import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(calc(bufferedReader.readLine()));
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных");
        }
    }

    public static String calc(String input) throws Exception {

        String[] arrayStr = input.split(" ");
        int x = Integer.parseInt(arrayStr[0]);
        int x2 = Integer.parseInt(arrayStr[2]);
        String c = arrayStr[1];
        String result = "";
        if (x < 1 || x > 10 || x2 < 1 || x2 > 10) {
            throw new Exception("Значения должны быть от 1 до 10 включительно");
        }
        if (input.length() > 3){
            throw new Exception("Данные передаются в одну строку: a + b, a - b, a * b, a / b");
        }
        switch (c) {
            case "+":
                result = x + x2 + "";
                break;
            case "*":
                result = x * x2 + "";
                break;
            case "-":
                result = x - x2 + "";
                break;
            case "/":
                result = x / x2 + "";
                break;
            default:
                System.out.println("Вы ввели неверное значение");
        }
        return result;
    }
}