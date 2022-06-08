package Days;

import java.util.Arrays;
import java.util.List;

public class Day4 {

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        char [][] arr = new char[grid.size()][grid.get(0).length()];

        int i =0;
        for (String s : grid){
            char [] thingy = s.toCharArray();
            Arrays.sort(thingy);
            for (int j = 0; j<s.length();j++){
                arr[i][j] = thingy[j];
            }
            i++;
        }

        for (int j=0; j<arr[j].length-1;j++){
            for (int k =0; k<arr.length-1;k++){
                if(arr[k][j]>arr[k+1][j]){
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static int superDigit(String n, int k) {
        // Write your code here

        if(n.length()==1 && k ==1){
            return Integer.parseInt(n);
        }

        String p = "";
        long total =0;

        for(char c: n.toCharArray()){
            total+= Character.getNumericValue(c);
        }

        total = total * k;
        p = String.valueOf(total);

        while(p.length()!=1){
            total =0;
            for(char c: p.toCharArray()){
                total+= Character.getNumericValue(c);
            }
            p = String.valueOf(total);
        }

        return Integer.parseInt(p);
    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribes =0;
        int position =1;
        boolean tooChaotic = false;
        for(Integer i : q){
            if(Math.abs(i-position) >2){
                System.out.println("Too chaotic");
                tooChaotic = true;
                break;
            }
            if(i-position>0){
                bribes += i-position;
            }
            position++;
        }
        if(!tooChaotic){
            System.out.println(bribes);
        }
    }
}
