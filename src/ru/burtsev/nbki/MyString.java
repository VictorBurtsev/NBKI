package ru.burtsev.nbki;

public class MyString {

    private String string;

    MyString(String string) {
        this.string = string;
    }

    /* - замена заданного символа в строке (написать свой аналог известного метода) */

    public String replace (final char oldChar, final char newChar) {

        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length(); i++) {
           if (stringBuilder.charAt(i) == oldChar)
               stringBuilder.setCharAt(i, newChar);
        }

        return new String(stringBuilder);
    }

    /* - преобразование строки в целочисленное значение */

    public int toInt () {
        return new Integer(string);
    }

    /* - преобразование строки в число с плавающей запятой */

    public double toDouble () {
        return new Double(string);
    }
}
