package Days;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Day2 {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashSet<Integer> arr = new HashSet<>();
        for(int i : a){
            if(arr.contains(i)){
                arr.remove(i);
            }
            else{
                arr.add(i);
            }
        }

        for (int i : arr){
            return i;
        }
        return 0;
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftDiag = 0;
        int rightDiag = 0;

        for(int i =0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size();j++){
                if(i==j){
                    leftDiag += arr.get(i).get(j);
                }
                if(i+j==(arr.size()-1)){
                    rightDiag+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftDiag- rightDiag);
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Integer[] sortArray = new Integer[100];
        Arrays.fill(sortArray,0);
        for (int i: arr){
            sortArray[i]+=1;
        }
        return Arrays.asList(sortArray);
    }
}
