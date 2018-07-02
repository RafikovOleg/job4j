package ru.job4j.calculate;

import org.junit.Test;
import ru.job4j.calculate.Calculate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Oleg Rafikov (olegr282@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOneToOneThenTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Calculate.main(null);
        assertThat(
                out.toString(),
                is(
                        String.format(
                                "Hello World%s",
                                System.getProperty("line.separator")
                        )
                )
        );
    }
}