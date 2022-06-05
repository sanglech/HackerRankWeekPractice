import Days.Day1;

import java.util.*;

import static Days.Day1.miniMaxSum;
import static Days.Day1.plusMinus;
import static Days.Day2.countingSort;
import static Days.Day2.lonelyinteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Day 1 Challenges
        plusMinus(Arrays.asList(1,1,0,-1,-1));
        miniMaxSum(Arrays.asList(1,3,5,7,9));
        System.out.println(Day1.timeConversion("07:05:45AM"));

        //Day 2 Challenges
        System.out.println(lonelyinteger(Arrays.asList(1,2,2,3,4,1,3)));
        System.out.println(countingSort(Arrays.asList(1,1,3,2,1)));
    }
}