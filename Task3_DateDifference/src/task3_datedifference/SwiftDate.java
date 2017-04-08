/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3_DateDifference;

/**
 *
 * @author Georgi
 */
public class SwiftDate {

    int year;
    int month;
    int day;

    boolean IsLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    int getCentury() {
        int result = this.year / 100 + 1;
        return result;
    }

    int getDaysDifference(SwiftDate other) {
        int result = 0;

        result += (year - other.year) * 365;
        result += (month - other.month) * 30;
        result += (day - other.day) * 1;

        if (year > other.year) {
            for (int i = 1; i <= (year - other.year); i++) {
                if (IsLeapYear(year - i)) {
                    result++;
                }

            }
        } else {
            for (int i = 1; i <= (other.year - year); i++) {
                if (IsLeapYear(other.year - i)) {
                    result++;
                }
            }

        }

        if (result < 0) {
            if (IsLeapYear(year) && month > 2) {
                result++;
            }
            if (IsLeapYear(other.year) && other.month < 3 && other.day <29) {
                result++;
            }
            return -result;
        } else {
            if (IsLeapYear(other.year) && other.month < 3 && other.day <29) {
                result--;
            }
            if (IsLeapYear(year) && month < 2) {
                result--;
            }
            return result;
        }
    }

    String getInfo() {
        String result = String.format("%d %d %d %d century.", this.year, this.month, this.day, getCentury());
        if (this.IsLeapYear(year)) {
            result += "it is a LEAP year.";
        }

        return result;
    }
}
