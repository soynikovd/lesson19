package lesson19;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String, String> peopleMap = new HashMap<>();

        peopleMap.put("Jackson", "1999-03-15");
        peopleMap.put("Johnson", "1985-07-20");
        peopleMap.put("White", "1978-08-05");
        peopleMap.put("Pitt", "1992-06-10");
        peopleMap.put("DiCaprio", "1983-08-25");
        peopleMap.put("Tyson", "2000-04-12");
        peopleMap.put("Balboa", "1976-10-30");
        peopleMap.put("Lennon", "1966-06-17");
        peopleMap.put("Tarantino", "1991-12-22");
        peopleMap.put("Smith", "1989-02-28");

        Map<String, String> peopleMap2 = new HashMap<>();

        for (Map.Entry<String, String> entry : peopleMap.entrySet()) {
            String birthDate = entry.getValue();
            int birthMonth = Integer.parseInt(birthDate.substring(5, 7));
            if (!(birthMonth >= 6 && birthMonth <= 8)) {
                peopleMap2.put(entry.getKey(), birthDate);
            }
        }
        System.out.println("Мапа після видалення людей, які народилися влітку:");
        for (Map.Entry<String, String> entry : peopleMap2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}