package End;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        // Введення рядків з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input;
            while (true) {
                System.out.print("Введіть рядок: ");
                input = reader.readLine();
                if (input.equals("end")) {
                    break;
                }
                strings.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Виведення рядків на екран
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

