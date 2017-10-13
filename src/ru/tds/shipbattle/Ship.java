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
     * @param shot координата выстрела игрока
     * @return "Попал", если координата выстрела игрока и местоположения корабля совпадают. "Мимо", если  координата
     * выстрела игрока и местоположения корабля не совпадают. "Потоплен", если  координата выстрела игрока и
     * местоположения корабля совпадают и ArrayList с местоположением корабля пустой (то есть пользователь попал в корабль  3 раза).
     */
    public String check(String shot) {
        String result = "Мимо";
        int index = location.indexOf(shot);
        if (index != -1) {
            location.remove(index);
            result = "Ранен";
        }
        if (location.isEmpty()) {
            result = "Потоплен";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Корабль находится на координатах " + location;
    }
}
