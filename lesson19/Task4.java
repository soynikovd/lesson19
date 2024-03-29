package lesson19;

public class Task4 {
    public static void main(String[] args) {
        int pelmens = 10;
        int luckyPelmen = 5;

        for (int i = 1; i <= pelmens; i++) {
            if (i == luckyPelmen) {
                System.out.println("Ось щасливий пельмень!");
                break;
            }
        }
    }
}
