

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;

public class HomePage {


    public static void main(String[] args) {

//        double x = 39.21;
//        float y = 5.1f;
//
//
//        System.out.println(x + y);
//        //System.out.println((x + y).getClass().getName());
//
//        short a = 14;
//        float b = 13;
//        double c = 30;
//        long t = 192301398193810323L;
//
//        System.out.println(a * b / c);
//
//        System.out.println(4 * 5 / 4 + 2);
//
//        System.out.println((y > 5) ? 21 : "Zebra");
//
//        int[] willThisWork = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(willThisWork));
//
//        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
//        for (int[] mySimpleArray : myComplexArray) {
//            for (int i = 0; i < mySimpleArray.length; i++) {
//                System.out.print(mySimpleArray[i] + "\t");
//            }
//            System.out.println();
//        }

//        int x = 20;
//        while (x > 0) {
//            do {
//                x -= 2;
//                System.out.println("x = " + x);
//            } while (x > 5);
//                x--;
//                System.out.print("now x = "+ x + "\t");
//        }


//                int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
//                int searchValue = 2;
//                int positionX = -1;
//                int positionY = -1;
//                PARENT_LOOP: for(int i=0; i<list.length; i++) {
//                    for(int j=0; j<list[i].length; j++) {
//                        if(list[i][j]==searchValue) {
//                            positionX = i;
//                            positionY = j;
//                            break PARENT_LOOP;
//                        }
//                    }
//                }
//                if(positionX==-1 || positionY==-1) {
//                    System.out.println("Value "+searchValue+" not found");
//                } else {
//                    System.out.println("Value "+searchValue+" found at: " +
//                            "("+positionX+","+positionY+")");
//                }

//        for(int i=0; i<10 ; ) {
//            i = i++;
//            System.out.println("Hello World");
//            }

//        byte m = 40, n = 50;
//        byte sum = (byte) (m + n);
//        System.out.println(sum);
//
//        int x1 = 50, x2 = 75;
//        boolean p = x1 >= x2;
//        if(p = true) System.out.println("Success");
//         else System.out.println("Failure");

//

//
//        Period period10Days = Period.of(0, 0, 10);
//        Period period1Month = Period.of(0, 1, 0);
//        System.out.println(period10Days.minus(period1Month));
//        System.out.println(period10Days.minusDays(5));
//        System.out.println(period10Days.minusMonths(5));
//        System.out.println(period10Days.minusYears(5));
//
//        System.out.println();
//
//        LocalDate bday = LocalDate.of(2020, 10, 29);
//        LocalDate today = LocalDate.now();
//        Period period10Days2 = Period.of(0, 0, 10);
//        if (bday.minus(period10Days2).isBefore(today))
//            System.out.println("Time to send out reminders to friends");
//
//        System.out.println();
//
//        Period year1Month9Day20 = Period.of(1, 9, 20);
//        System.out.println(year1Month9Day20.multipliedBy(2));
//        System.out.println(year1Month9Day20.multipliedBy(-2));
//
//        System.out.println();
//
//        System.out.println(Period.of(10,5,40).toTotalMonths());
//
//        System.out.println();
//
//        DateTimeFormatter formatter1 =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        DateTimeFormatter formatter2 =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        DateTimeFormatter formatter3 =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
//        DateTimeFormatter formatter4 =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        LocalDate date = LocalDate.now();
//        System.out.println(formatter1.format(date));
//        System.out.println(formatter2.format(date));
//        System.out.println(formatter3.format(date));
//        System.out.println(formatter4.format(date));
//
//        System.out.println();
//
//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
//        LocalTime time = LocalTime.now();
//        System.out.println(formatter.format(time));



//                int[] arr = new int[5];
//                byte b = 4; char c = 99; int longVar = 10;
//                arr[0] = b;
//                arr[1] = c;
//                arr[3] = longVar;
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.println(arr[i]);

                    ArrayList<String> ejg = new ArrayList<>(); // line 4
                    ejg.add("One"); // line 5
                    ejg.add("Two"); // line 6
                    System.out.println(ejg.contains(new String("One"))); // line 7
                    System.out.println(ejg.indexOf("Two")); // line 8
                    ejg.clear(); // line 9
                    System.out.println(ejg); // line 10
//                    System.out.println(ejg.get(1)); // line 11







    } //main
}
