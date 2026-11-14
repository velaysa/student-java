package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void averageCalculatesCorrectly() {
        int[] numbers = {2, 4, 6, 8};

        double result = CourseToolkit.average(numbers);

        assertEquals(5.0, result);
    }

    @Test
    void palindromeWorksCorrectly() {
        assertTrue(CourseToolkit.isPalindrome("radar"));
        assertFalse(CourseToolkit.isPalindrome("hello"));
    }

    @Test
    void primeNumbersWorkCorrectly() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(7));
        assertTrue(CourseToolkit.isPrime(13));

        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(9));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void averageHandlesDifferentNumbers() {
        assertEquals(4.0, CourseToolkit.average(new int[]{2, 4, 6}));
        assertEquals(-6.0, CourseToolkit.average(new int[]{-3, -6, -9}));
        assertEquals(1.5, CourseToolkit.average(new int[]{1, 2}));
    }

    @Test
    void averageRejectsEmptyArray() {
        assertThrows(IllegalArgumentException.class,
                () -> CourseToolkit.average(new int[]{}));
    }

    @Test
    void averageRejectsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> CourseToolkit.average(null));
    }

    @Test
    void palindromeEdgeCases() {
        assertTrue(CourseToolkit.isPalindrome(""));
        assertTrue(CourseToolkit.isPalindrome("a"));
        assertTrue(CourseToolkit.isPalindrome("abba"));

        assertFalse(CourseToolkit.isPalindrome("abc"));
        assertFalse(CourseToolkit.isPalindrome(null));
    }

    @Test
    void primeEdgeCases() {
        assertTrue(CourseToolkit.isPrime(97));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(4));
        assertFalse(CourseToolkit.isPrime(100));
    }
}
