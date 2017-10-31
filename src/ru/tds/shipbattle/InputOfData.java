package ru.tds.shipbattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;
import java.util.Scanner;

/**
 * Класс, в котором реализован ввод данных пользователем и проверка корректности данных с помощью шаблона регулярных выражений.
 *
 * @author Trushenkov Dmitry 15ИТ18
 */
public class InputOfData {
    /**
     * Метод для организации ввода пользователем координат выстрела,до тех пор пока введенные пользователем данные не будут корректны.
     *
     * @return строка с координатами выстрела
     */
    public static String input() throws IOException {
        String string;
        do {
            string = reader();
        } while (!isCheckup(string));
        return string;
    }

    /**
     * Метод для ввода пользователем координат выстрела от 0 до 9.
     *
     * @return строка с координатами выстрела от 0 до 9.
     */
    public static String reader() throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты выстрела от 0 до 9: ");
        return reader.readLine();
    }

    /**
     * Метод для проверки введенной строки на корректность с помощью шаблона регулярного выражения.
     *
     * @param string строка, которая проверяется на корректность
     * @return true, если строка совпадает с шаблоном, то есть ввод корректный. false, если не совпадает с шаблоном.
     */
    public static boolean isCheckup(String string) {
        Pattern pattern = Pattern.compile("^[0-9]{1}$");
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}

