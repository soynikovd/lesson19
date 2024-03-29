package lesson19;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        String answer;

        System.out.println("Що це таке: синій, великий, з вусами і повністю набитий зайцями?");

        while (attempts > 0) {
            System.out.print("Ваша відповідь: ");
            answer = scanner.nextLine();

            if (answer.equals("Тролейбус")) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equals("Здаюсь")) {
                System.out.println("Правильна відповідь: тролейбус.");
                break;
            } else {
                System.out.println("Подумай ще.");
                attempts--;
            }
        }
        if (attempts == 0) {
            System.out.println("Ви використали всі спроби. Правильна відповідь: тролейбус.");
        }
    }
}
