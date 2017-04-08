package Task3_DateDifference;

import java.util.Scanner;

public class Task3_DateDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwiftDate date2 = new SwiftDate();
        SwiftDate date1 = new SwiftDate();
        date1.year = sc.nextInt();
        date1.month = sc.nextInt();
        date1.day = sc.nextInt();
        date2.year = sc.nextInt();
        date2.month = sc.nextInt();
        date2.day = sc.nextInt();
        System.out.println(date1.getDaysDifference(date2));
        System.out.println(date1.getInfo());
        System.out.println(date2.getInfo());
    }

}
