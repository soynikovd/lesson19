package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введіть 10 слів: ");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.set(i, s.substring(1));

        }
        System.out.println("Результат:");
        for (String str : list) {
            System.out.println(str);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            String str = list.get(i);
            System.out.println(reverseString(str));
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString() + " " + str.length();
    }
}
