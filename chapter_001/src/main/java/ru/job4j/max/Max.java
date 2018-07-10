package ru.job4j.max;

/**
 * Класс Max , решение задачи 4.2 Максимум из двух чисел.
 *
 * @author Oleg Rafikov.
 * @since 10.07.18.
 */

public class Max {
    /**
     * метод max-выявление наибольшего значения из двух.
     *
     * @param first
     * @param second
     * @return
     */
    public int max(int first, int second) {

        /**
         * декларируем целочисленную переменную maximum и инициализируем ее значением
         * полученным из тернарного выражения.
         */
        int maximum = first < second ? second : first;
        /**
         * metod return.
         */
        return maximum;
    }

}
