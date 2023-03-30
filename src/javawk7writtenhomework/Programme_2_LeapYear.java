package javawk7writtenhomework;

import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//declare scanner
        System.out.println("Please enter the year : ");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapyear = new Programme_2_LeapYear();
        scanner.close();//closing scanner

    }

    public void isIiLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The Year " + year + " is not a leap year");

    }
}