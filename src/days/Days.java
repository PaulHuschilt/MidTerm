/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */
// Class returns void, prints the values of the weekdays enums to output stream
public class Days {

    public static void main(String[] args) {
        listNames(); 
    }

    public static void listNames() {
        System.out.println("All the day names:");
        
        // Values of weekday enum
        Weekdays[] daysArray = Weekdays.values();

        // iterate through the enum constants
        for (int i = 0; i < daysArray.length; i++) {
            System.out.println(daysArray[i].getDayName());
        }
    }
}
