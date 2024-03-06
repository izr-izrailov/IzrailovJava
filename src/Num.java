import java.util.Scanner;

/*
 * 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
 * - сравнивает эти два числа и возвращает результат сравнения
 * путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
 * - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
 */

public class Num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        System.out.println((a > b) ? "a > b" : (a < b) ? "a < b" : "a = b");

        System.out.println("Операции сложения, вычитания, деления и умножения над числами a и b:");


        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        try {
            System.out.printf("%d / %d = %d", a, b, a / b);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя");
        }
    }
}
