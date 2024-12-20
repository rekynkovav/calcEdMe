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
        int variableOne = Integer.parseInt(arrayStr[0]);
        int variableTwo = Integer.parseInt(arrayStr[2]);

        volidate(variableOne,variableTwo,input.length());

        String operator = arrayStr[1];
        String result = "";

        switch (operator) {
            case "+":
                result = variableOne + variableTwo + "";
                break;
            case "*":
                result = variableOne * variableTwo + "";
                break;
            case "-":
                result = variableOne - variableTwo + "";
                break;
            case "/":
                result = variableOne / variableTwo + "";
                break;
            default:
                System.out.println("Вы ввели неверное значение");
        }
        return result;
    }

    public static void volidate(int variableOne, int variableTwo, int length) throws Exception{

        if (variableOne < 1 || variableOne > 10 || variableTwo < 1 || variableTwo > 10) {
            throw new Exception("Значения должны быть от 1 до 10 включительно");
        }
        if (length > 3){
            throw new Exception("Данные передаются в одну строку: a + b, a - b, a * b, a / b");
        }
    }
}