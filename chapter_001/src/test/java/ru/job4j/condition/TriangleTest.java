package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Oleg rafikov
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {

        /**
         *  создаем три объекта класса Point.
         */
        Point a = new Point(2, 3);
        Point b = new Point(4, 5);
        Point c = new Point(5, 1);

        /**
         * Создаем объект треугольник и передаем в него объекты точек.
         */
        Triangle triangle = new Triangle(a, b, c);

        /**
         * Вычисляем площадь.
         */
        double result = triangle.area();

        /**
         * Задаем ожидаемый результат.
         */
        double expected = 5;

        /**
         * Проверяем результат и ожидаемое значение.
         */
        assertThat(result, closeTo(expected, 0.1));
    }
}