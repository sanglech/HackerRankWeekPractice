package Days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        List<Integer> positiveNum = new ArrayList<Integer>();
        List<Integer> negativeNum = new ArrayList<Integer>();
        List<Integer> zeroNum = new ArrayList<Integer>();

        for (int i : arr){
            if(i>0){
                positiveNum.add(i);
            }
            else if(i<0){
                negativeNum.add(i);
            }
            else {
                zeroNum.add(i);
            }
        }

        double positiveRatio = (double)positiveNum.size() / (double)arr.size();
        double negativeRatio = (double)negativeNum.size() / (double)arr.size();
        double zeroRatio = (double)zeroNum.size() / (double)arr.size();
        System.out.println(String.format("%-8s",String.valueOf(positiveRatio)).replace(' ','0'));
        System.out.println(String.format("%-8s",String.valueOf(negativeRatio)).replace(' ','0'));
        System.out.println(String.format("%-8s",String.valueOf(zeroRatio)).replace(' ','0'));

    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long min =0;
        long max =0;

        for(int i =0;i<arr.size() && i< 4;i++) {
            min+= arr.get(i);
        }

        for (int j = arr.size() - 1;j >=0 && j >= (arr.size()-4);j--){
            max += arr.get(j);
        }

        System.out.println(min +" "+ max);
    }

    public static String timeConversion(String s) {
        // Write your code here
        String militaryTime;
        if(s.startsWith("PM", 8)){
            if(s.startsWith("12")){
                militaryTime= "12"+ s.substring(2,8);
            }
            else {
                int hour = Integer.parseInt(s.substring(0,2)) + 12;
                militaryTime = hour +s.substring(2,8);
            }
        }
        else {
            if(s.startsWith("12")){
                militaryTime= "00"+ s.substring(2,8);
            }
            else {
                militaryTime = s.substring(0,8);
            }
        }
        return militaryTime;
    }
}
