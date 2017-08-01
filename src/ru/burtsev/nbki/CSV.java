package ru.burtsev.nbki;

/* - необходимо отсортировать csv-файл */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CSV {
    private String string = "";
    private ArrayList<String> arrayList = new ArrayList<>();

    public void readAndSort() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("resource/input.csv"))) {
            while ((string = bufferedReader.readLine()) != null) {

                String[] number = string.split(";");

                for (int i = 0; i < number.length; i++) {
                    arrayList.add(number[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);
    }
}
