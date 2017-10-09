package ru.tds.shipbattle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс, в котором реализована игра "Морской бой".
 *
 * @author Trushenkov Dmitry 15ИТ18
 */
public class Game {
    public static void main(String[] args) {
        ArrayList<String> localOfShip = new ArrayList<>();
        initShipLocation(localOfShip);
        Ship ship = new Ship();
        ship.setLocation(localOfShip);
        countOfTry(ship);
    }

    public static void initShipLocation(ArrayList<String> arrayList) {
        arrayList.add(String.valueOf((int) ((Math.random() * 7))));
        arrayList.add(String.valueOf((Integer.parseInt(arrayList.get(0))) + 1));
        arrayList.add(String.valueOf(Integer.parseInt(arrayList.get(1)) + 1));
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты выстрела от 0 до 9: ");
        int shot = sc.nextInt();
        return String.valueOf(shot);
    }
    public static void countOfTry(Ship ship){
        int countOfTry = 0;
        while (!ship.getLocation().isEmpty()) {
            System.out.println(ship.check(input()));
            countOfTry++;
        }
        System.out.println("Вы победили! Количество попыток: " + countOfTry);
    }
}
