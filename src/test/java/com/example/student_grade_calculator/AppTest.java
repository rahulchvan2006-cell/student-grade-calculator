package com.example.student_grade_calculator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCalculateTotal() {
        int[] marks = {80, 85, 90, 75, 70};
        assertEquals(400, App.calculateTotal(marks));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(80.0, App.calculateAverage(400), 0.001);
    }

    @Test
    public void testCalculateGrade() {
        assertEquals("A+", App.calculateGrade(95.0));
        assertEquals("A", App.calculateGrade(85.0));
        assertEquals("B", App.calculateGrade(75.0));
        assertEquals("C", App.calculateGrade(65.0));
        assertEquals("D", App.calculateGrade(55.0));
        assertEquals("F", App.calculateGrade(40.0));
    }

    @Test
    public void testInvalidMarks() {
        int[] invalidMarks = {80, -5, 90, 75, 70};
        assertThrows(IllegalArgumentException.class, () -> App.calculateTotal(invalidMarks));
    }
}