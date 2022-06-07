package Days;

import java.util.HashMap;
import java.util.Objects;

public class Day3 {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        if(t.length()<s.length()){
            return false;
        }

        for(int i =0; i< s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.computeIfPresent(s.charAt(i),(k,v)->v+1);
            } else {
                sMap.put(s.charAt(i),1);
            }
        }

        for(int i =0; i< t.length();i++){
            if(tMap.containsKey(t.charAt(i))){
                tMap.computeIfPresent(t.charAt(i),(k,v)->v+1);
            } else {
                tMap.put(t.charAt(i),1);
            }
        }

        for (char k : tMap.keySet()){
            if(!sMap.containsKey(k)){
                return false;
            } else {
                if(!Objects.equals(sMap.get(k), tMap.get(k))){
                    return false;
                }
            }
        }
        return true;

    }

    public static int towerBreakers(int n, int m) {
        // Write your code here
        int player = 1;
        for (int i =0; i<n;i++){
            int height = m;
            while(height > 1) {
                if(n%2!=0){
                    return 1;
                }
                height = height /2;
                player ++;
            }
        }
        if(player%2==0){
            return 1;
        }
        return 2;
    }

    public static String caesarCipher(String s, int k) {
        final StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                final int aNumberValue = Character.isUpperCase(c) ? 'A' : 'a';
                final int value = (c + k - aNumberValue) % 26;
                sb.append((char) (value + aNumberValue));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static boolean isPalindrome(String s) {
        final StringBuilder sb = new StringBuilder();
        for (Character c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        int i =0;
        int j = sb.length()-1;

        while(i<j){
            if(sb.charAt(i) != sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
