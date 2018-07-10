package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Oleg Rafikov (olegr282@gmail.com).
 * @version $Id$
 * @since 10.07.18.
 */

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {

        /**
         * Создаем обьект maxim класса max.
         */
        Max maxim = new Max();

        /**
         * декларируем целочисленную переменную result и инициализируем ее значением из метода max передавая в него
         * два параметра.
         */
        int result = maxim.max(1, 2);
        /**
         * производим сравнение ожидаемого и полученного значений.
         */
        assertThat(result, is(2));
    }
}
