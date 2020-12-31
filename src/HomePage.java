

import java.time.*;
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

        LocalDate date1 = LocalDate.of(2015, 12, 27);
        LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27);
        LocalDate date3 = LocalDate.now();
        System.out.println(date1 + " : " + date2 + " : " + date3);

        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");
        System.out.println(shreyaBday.isAfter(paulBday));
        System.out.println(shreyaBday.isBefore(paulBday));
        System.out.println(shreyaBday.isBefore(shreyaBday));

        LocalDate bday = LocalDate.now();
        System.out.println(bday.minusDays(10));
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));
        System.out.println(bday.plusDays(1));
        System.out.println(bday.plusMonths(1));
        System.out.println(bday.plusWeeks(7));
        System.out.println(bday.plusYears(1));
        System.out.println(bday.withDayOfMonth(1));
        System.out.println(bday.withDayOfYear(1));
        System.out.println(bday.withMonth(7));
        System.out.println(bday.withYear(1));
        System.out.println(bday.atTime(16, 30));
        System.out.println(bday.atTime(16, 30, 20));
        System.out.println(bday.atTime(16, 30, 20, 300));
        System.out.println(bday.atTime(LocalTime.of(16, 30)));
        System.out.println(bday.toEpochDay());


        System.out.println();
        LocalTime timeHrsMin = LocalTime.of(12, 12);
        LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
        LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);
        System.out.println(timeHrsMin);
        System.out.println(timeHrsMinSec);
        System.out.println(timeHrsMinSecNano);
        System.out.println(LocalTime.now());
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        System.out.println();
        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
            System.out.println("New world record");
        else
            System.out.println("Try harder");

        System.out.println();
        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        if (prizeCeremony.getMonthValue() == 6)
            System.out.println("Can't invite president");
        else
            System.out.println("President invited");
        LocalDateTime chiefGuestDeparture =
                LocalDateTime.parse("2050-06-05T14:30:00");
        if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
            System.out.println("Chief Guest will leave before ceremony completes");
        LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
        if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
            System.out.println("Manager is supposed to arrive 3 hrs earlier");

        System.out.println();
        LocalDate carnivalStart = LocalDate.of(2050, 10, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
        Period periodBetween = Period.between(carnivalStart, carnivalEnd);
        System.out.println(periodBetween);;







    } //main
}
