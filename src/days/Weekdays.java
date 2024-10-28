/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public enum Weekdays {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private String dayName;

    // Constructor
    Weekdays(String dayName) {
        this.dayName = dayName;
    }

    // Method to get the day name
    public String getDayName() {
        return this.dayName;
    }
}


