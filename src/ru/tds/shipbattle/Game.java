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
        ArrayList<String> localOfShip = initShipLocation();
        Ship ship = new Ship();
        ship.setLocation(localOfShip);
        startGameAndCountOfTry(ship);

    }

    /**
     * Метод для заполнения ArrayLista с местоположением корабля.
     *
     * @return ArrayList  с местоположением корабля.
     */
    public static ArrayList initShipLocation() {
        ArrayList <String> location = new ArrayList<>();
        int number =(int) Math.random() * 7;
        location.add(String.valueOf(number));
        location.add(String.valueOf(number +1 ));
        location.add(String.valueOf(number +2 ));
        return location;
    }

    /**
     * Метод для ввода пользователем координат выстрела.
     *
     * @return координата выстрела, введенная пользователем.
     */
    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты выстрела от 0 до 9: ");
        String shot = sc.next();
        return shot;
    }

    /**
     * Метод для общения пользователя с компьютером,которое реализовано с помощью цикла,
     * а также для подсчета количества попыток, понадобившихся пользователю для того, чтобы потопить корабль.
     *
     * @param ship корабль, который нужно потопить.
     */
    public static void startGameAndCountOfTry(Ship ship) {
        int countOfTry = 0;
        while (!ship.getLocation().isEmpty()) {
            System.out.println(ship.check(input()));
            countOfTry++;
        }
        System.out.println("Вы победили! Количество попыток: " + countOfTry);
    }
}
