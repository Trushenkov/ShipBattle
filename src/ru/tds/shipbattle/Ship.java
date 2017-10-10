package ru.tds.shipbattle;

import java.util.ArrayList;

/**
 * Класс для представления объекта "Корабль".
 *
 * @author Trushenkov Dmitry 15ИТ18
 */
public class Ship {

    private ArrayList<String> location;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    /**
     * Метод, который принимает в качестве параметра координаты выстрела игрока и сравнивает их
     * с местоположением корабля. В зависимости от попаданий и их количества, посылает сообщения об этом пользователю
     *
     * @param shot координаты игрока о выстреле
     */
    public String check(String shot) {
        String result;
        int index = location.indexOf(shot);
        if (index != -1) {
            location.remove(index);
            result = "Ранен";
            if (location.isEmpty()) {
                result = "Потоплен";
            }
        } else {
            result = "Мимо";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Корабль находится на координатах " + location;
    }
}
