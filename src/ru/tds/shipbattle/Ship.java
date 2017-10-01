package ru.tds.shipbattle;

/**
 * Класс для представления объекта "Корабль".
 */
public class Ship {
    private int[] local;
    private int amountOfHit=0;

    public void setLocal(int[] local) {
        this.local = local;
    }

    public Ship(int[] local) {
        this.local = local;
    }

    /**
     * Метод, который принимает в качестве параметра координаты выстрела игрока и сравнивает их
     * с местоположением корабля. В зависимости от попаданий и их количества, посылает сообщения об этом пользователю
     *
     * @param string координаты игрока о выстреле
     * @return строка с результатом состояния корабля
     */
    public void check(String string) {
        int fire = Integer.parseInt(string);
        for (int partOfShip: local) {
            if (fire == partOfShip&&fire<3) {
                System.out.println("Ранил");
                amountOfHit++;
                return;
            }

            if (fire != partOfShip) {
                System.out.println("Мимо");
                return;
            }
            if (amountOfHit == 3) {
                System.out.println("Потопил");
                return;
            }
        }
    }
}
