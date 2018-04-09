package com.fmi.tv.tests;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author emanuel.dumitru9@gmail.com
 *
 */
@SuppressWarnings("Duplicates")
public class EquivalencePartitioningTest {

    @Test(expected = NoSuchElementException.class)
    public void testEquivalencePartitioning1() {
        String input = "0";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals("Input an integer between 1 and 10: ", output.get(0));
        Assert.assertEquals("Input an integer between 1 and 10: ", output.get(1));
        Assert.assertEquals(output.size(), 2);
    }

    @Test(expected = NoSuchElementException.class)
    public void testEquivalencePartitioning2() {
        String input = "12";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals("Input an integer between 1 and 10: ", output.get(0));
        Assert.assertEquals("Input an integer between 1 and 10: ", output.get(1));
        Assert.assertEquals(output.size(), 2);
    }

    @Test(expected = NoSuchElementException.class)
    public void testEquivalencePartitioning3() {
        String input = "4 1 2 3 4 1 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);

    }

    @Test
    public void testEquivalencePartitioning4() {
        String input = "4 1 2 3 4 1 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testEquivalencePartitioning5() {
        String input = "4 1 2 3 4 5 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 5 does not appear in v"), true);
    }

    @Test
    public void testEquivalencePartitioning6() {
        String input = "4 1 2 3 4 5 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 5 does not appear in v"), true);
    }
}
