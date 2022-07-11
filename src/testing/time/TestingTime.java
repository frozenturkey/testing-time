/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dangnguyen
 */
public class TestingTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd",
                Locale.US);
        System.out.println("Enter date and time in the format yyyy-MM-dd");
        System.out.println("For example, it is now " + format.format(new Date()));
        Date date = null;
        while (date == null) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            try {
                date = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
        }
    }

}
