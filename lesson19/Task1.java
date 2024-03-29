package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введіть 10 чисел: ");
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }

        for (int i : list) {
            System.out.print(i + " ");
            System.out.print("");
        }

        System.out.println("Кількість елементів колекції: " + list.size());

        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Максимальний елемент колекції: " + max);
        for(int i : list){
            if (1 % 2 != 0) {
                i = 0;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.set(i, 0);
            }
        }


        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
        int sum = 0;
        double a = (double) sum / list.size();
        System.out.println("Середнє арифметичне значення усіх елементів колекції: " + a);

        sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += list.get(i);
        }
        double aFive = (double) sum / 5;
        System.out.println("Середнє арифметичне значення перших п'яти елементів колекції: " + aFive);

        List<Integer> numbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                numbers.add(number);
            }
        }
        System.out.println("Парні елементи у іншій колекції: " + numbers);
    }
}

