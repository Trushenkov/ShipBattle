package ru.tds.shipbattle;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Класс, в котором реализована игра "Морской бой".
 *
 * @author Trushenkov Dmitry 15ИТ18
 */
public class Game {
    public static void main(String[] args) throws IOException {
        Ship ship = new Ship();
        ship.setLocation(shipLocation());
        int countOfTry = 0;
        String statusOfShip;
        do {
            System.out.println(statusOfShip = ship.checkForHit(InputOfData.input()));
            countOfTry++;
        } while (statusOfShip != "Потоплен");
        System.out.println("Вы победили! Количество попыток: " + countOfTry);
    }

    /**
     * Метод для задания координат местоположения корабля.
     *
     * @return ArrayList с координатами местоположения корабля.
     */
    public static ArrayList shipLocation() {
        ArrayList<String> location = new ArrayList<>();
        int number = (int) (Math.random() * 7);
        location.add(String.valueOf(number));
        location.add(String.valueOf(number + 1));
        location.add(String.valueOf(number + 2));
        return location;
    }
}
