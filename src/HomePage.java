import java.util.Arrays;

public class HomePage {


    public static void main(String[] args) {

        double x = 39.21;
        float y = 5.1f;


        System.out.println(x + y);
        //System.out.println((x + y).getClass().getName());

        short a = 14;
        float b = 13;
        double c = 30;
        long t = 192301398193810323L;

        System.out.println(a * b / c);

        System.out.println(4 * 5 / 4 + 2);

        System.out.println((y > 5) ? 21 : "Zebra");

        int[] willThisWork = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(willThisWork));

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

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

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); //-1

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);


    } //main
}
