import java.util.Scanner;

/*
 * 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
 * В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
 */

public class Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку a: ");
        String a = scanner.next();
        System.out.print("Введите строку b: ");
        String b = scanner.next();

        System.out.println(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
        //Игнорирование регистра слов
        //System.out.println(a.equalsIgnoreCase(b) ? "Строки идентичны" : "Строки неидентичны");
    }
}
