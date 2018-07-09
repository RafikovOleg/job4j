package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Oleg Rafikov (olegr282@gmail.com).
 * @version $Id$
 * @since 0.1
 */

public class PointTest {
    @Test
    public void distancePointAtoPointB() {
        Point a = new Point(3, 5);
        Point b = new Point(2, 6);
        /**
         * Metod
         */
        double result = a.distanceTo(b);
        assertThat(result, closeTo(1.4, 0.1));


    }
}
