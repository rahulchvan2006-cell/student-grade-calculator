package com.example.student_grade_calculator;

import java.util.Scanner;

public class App {

    public static int calculateTotal(int[] marks) {
        if (marks == null || marks.length != 5) {
            throw new IllegalArgumentException("Exactly 5 subject marks are required.");
        }
        int total = 0;
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            total += mark;
        }
        return total;
    }

    public static double calculateAverage(int total) {
        return total / 5.0;
    }

    public static String calculateGrade(double average) {
        if (average >= 90) return "A+";
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        if (average >= 50) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks obtained in 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total);
        String grade = calculateGrade(average);

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Average: " + average + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}