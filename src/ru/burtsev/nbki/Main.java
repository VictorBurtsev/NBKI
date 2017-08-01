package ru.burtsev.nbki;

public class Main {

    public static void main(String[] args) {
        System.out.println(new String("BlaBlaBla1").replace('B', 'C'));

        System.out.println(new MyString("BlaBlaBla2").replace('B', 'C'));

        System.out.println(new MyString("1234567890").toInt());

        System.out.println(new MyString("1234.567890").toDouble());

        new CSV().readAndSort();
    }
}
