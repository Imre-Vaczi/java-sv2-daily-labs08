package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @Test
    void testConstructorList() {
        NumberSequence numberSequence = new NumberSequence(Arrays.asList(10, 20, 40, 50, 60, 70, 80, 90, 100));
        assertEquals(9, numberSequence.getRandomIntList().size());
    }

    @Test
    void testConstructorInts() {
        NumberSequence numberSequence = new NumberSequence(9,10,100);
        assertEquals(9, numberSequence.getRandomIntList().size());
    }

    @Test
    void testCloseToAverage() {
        NumberSequence numberSequence = new NumberSequence(Arrays.asList(10, 20, 40, 30));
        assertEquals(2, numberSequence.closeToAverage(5).size());
        assertEquals(4, numberSequence.closeToAverage(15).size());
        assertEquals(0, numberSequence.closeToAverage(2).size());
    }

}