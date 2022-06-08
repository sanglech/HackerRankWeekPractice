import Days.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Days.Day1.miniMaxSum;
import static Days.Day1.plusMinus;
import static Days.Day2.lonelyinteger;
import static Days.Day3.*;
import static Days.Day4.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Day 1 Challenges
        plusMinus(Arrays.asList(1,1,0,-1,-1));
        miniMaxSum(Arrays.asList(1,3,5,7,9));
        System.out.println(Day1.timeConversion("07:05:45AM"));

        //Day 2 Challenges
        System.out.println(lonelyinteger(Arrays.asList(1,2,2,3,4,1,3)));
        //System.out.println(countingSort(Arrays.asList(1,1,3,2,1)));

        // Day 3 Challanges + leet code
        System.out.println(isAnagram("car","rat"));
        System.out.println("TOWER BREAKERS: " + towerBreakers(1,4));
        System.out.println("Ceasear cipher: "+ caesarCipher("www.abc.xy",10));

        List<String> gridValues = new ArrayList<String>();
        gridValues.add("kc");
        gridValues.add("iu");
        System.out.println("gridChallenge: "+ gridChallenge(gridValues));

        int result = superDigit("9875",4);
        minimumBribes(Arrays.asList(1,2,5,3,7,8,6,4));
    }
}