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
         * metod return.
         */
        return first < second ? second : first;


    }

}
