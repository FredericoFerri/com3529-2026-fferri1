package uk.ac.shef.com3529;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalendarTest {

    // Write more test methods here to test different scenarios
    }
    @Test
    public void days_SameMonthClass(){
    
        int year1 = 2024, month1 = 3, day1 = 5;
        int year2 = 2024, month2 = 3, day2 = 10;

        int result = Calendar.daysBetweenTwoDates(year1,month1,day1,year2,month2,day2)

        assertEquals(5, result, "Expected difference of 5 days between March 5 and March 10")
    }
    @Test
    public void days_OneMonth30ToAnother30Class(){
    
        int year1 = 2024, month1 = 3, day1 = 5;
        int year2 = 2024, month2 = 3, day2 = 10;

        int result = Calendar.daysBetweenTwoDates(year1,month1,day1,year2,month2,day2)

        assertEquals(5, result, "Expected difference of 5 days between March 5 and March 10")

    }
        @Test
    public void days_OneMonth30ToAnother31Class(){
    
        int year1 = 2024, month1 = 3, day1 = 5;
        int year2 = 2024, month2 = 3, day2 = 10;

        int result = Calendar.daysBetweenTwoDates(year1,month1,day1,year2,month2,day2)

        assertEquals(5, result, "Expected difference of 5 days between March 5 and March 10")

    }
        @Test
    public void days_OneMonth31ToAnother31Class(){
    
        int year1 = 2026, month1 = 1, day1 = 5;
        int year2 = 2024, month2 = 3, day2 = 10;

        int result = Calendar.daysBetweenTwoDates(year1,month1,day1,year2,month2,day2)

        assertEquals(5, result, "Expected difference of 5 days between March 5 and March 10")

    }
    @Test
    public void days_oneRegularYearToAnotherClass(){

    }

    @Test
    public void days_oneRegularYearToLeapYearClass() {
        // Write your test code here
        // Arrange
        // ..
        // Act
        // ..
        // Assert
        // ..
    }
    @Test
    public void addLeapYearClass() {
        // Write your test code here
    }

    // Unhappy path
    @Test
    public void addUnexistingMonthClass() {

    }
    @Test
    public void addUnexistingDayClass()
    
    @Test
    public void addUnexistingDayInMonthsOf30DaysClass() {

    }
    @Test
    public void addUnexistingDayInMonthsOf30DaysClass() {

    }
