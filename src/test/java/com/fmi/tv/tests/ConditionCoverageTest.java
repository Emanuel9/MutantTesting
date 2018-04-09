package com.fmi.tv.tests;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@SuppressWarnings("Duplicates")
public class ConditionCoverageTest {

    @Test(expected = NoSuchElementException.class)
    public void conditionCoverageTest1() {
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
    public void conditionCoverageTest2() {
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
    public void conditionCoverageTest3() {
        String input = "1 1 1 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 1 appears in v at position 0"), true);
    }

    @Test(expected = NoSuchElementException.class)
    public void conditionCoverageTest4() {
        String input = "1 1 2 y";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));

        App.program();

        List<String> output = Arrays.asList(out.toString().split("\n"));
        Assert.assertEquals(output.contains("Nr 2 does not appear in v"), true);
    }
}
