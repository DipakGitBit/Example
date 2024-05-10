package com.springcore.test.intervw;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TimeDate {
    public static void main(String[] args) {
        // Create a LocalDate object representing the date
        LocalDate date = LocalDate.of(2024, 2, 6); // Year, Month, Day

        // Get the day of the week from the LocalDate object
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Print the day of the week
        System.out.println("Day of the week: " + dayOfWeek);
        
        // Alternatively, if you want to get the day of the week as a string
        String dayOfWeekString = dayOfWeek.toString();
        System.out.println("Day of the week (String): " + dayOfWeekString);

        // Alternatively, if you want to get the day of the week as an integer (1 for Monday, 2 for Tuesday, etc.)
        int dayOfWeekValue = dayOfWeek.getValue();
        System.out.println("Day of the week (Integer): " + dayOfWeekValue);
    }
}
