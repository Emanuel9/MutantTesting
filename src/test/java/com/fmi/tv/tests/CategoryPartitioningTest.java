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
public class CategoryPartitioningTest {

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning1() {
        String input = "-5";
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
    public void testCategoryPartitioning2() {
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
    public void testCategoryPartitioning3() {
        String input = "11";
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
    public void testCategoryPartitioning4() {
        String input = "15";
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
    public void testCategoryPartitioning5() {
        String input = "1 1 1 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test
    public void testCategoryPartitioning6() {
        String input = "1 1 1 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning7() {
        String input = "1 1 2 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 2 does not appear in v"), true);
    }

    @Test
    public void testCategoryPartitioning8() {
        String input = "1 1 2 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 2 does not appear in v"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning9() {
        String input = "3 1 2 3 1 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test
    public void testCategoryPartitioning10() {
        String input = "3 1 2 3 1 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning11() {
        String input = "3 1 2 3 2 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 2 appears in v at position 1"), true);
    }

    @Test
    public void testCategoryPartitioning12() {
        String input = "3 1 2 3 2 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 2 appears in v at position 1"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning13() {
        String input = "3 1 2 3 3 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 3 appears in v at position 2"), true);
    }

    @Test
    public void testCategoryPartitioning14() {
        String input = "3 1 2 3 3 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 3 appears in v at position 2"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning15() {
        String input = "3 1 2 3 4 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 4 does not appear in v"), true);
    }

    @Test
    public void testCategoryPartitioning16() {
        String input = "3 1 2 3 4 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 4 does not appear in v"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning17() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 1 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test
    public void testCategoryPartitioning18() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 1 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning19() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 3 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 3 appears in v at position 2"), true);
    }

    @Test
    public void testCategoryPartitioning20() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 3 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 3 appears in v at position 2"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning21() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 10 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 10 appears in v at position 9"), true);
    }

    @Test
    public void testCategoryPartitioning22() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 10 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 10 appears in v at position 9"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void testCategoryPartitioning23() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 11 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 11 does not appear in v"), true);
    }

    @Test
    public void testCategoryPartitioning24() {
        String input = "10 1 2 3 4 5 6 7 8 9 10 11 n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 11 does not appear in v"), true);
    }
}
