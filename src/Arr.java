/*
 * 3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
 * Необходимо написать программу, которая выведет в консоль все чётные числа.
 */

public class Arr {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}