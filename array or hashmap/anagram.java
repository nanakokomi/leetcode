package everydayExercise_2022_11;

import java.util.Arrays;
import java.util.HashMap;

public class anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
     char[] ss = s.toCharArray();
     char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);

    }
    public boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> ss = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tt = new HashMap<Character, Integer>();
        for (int i = 0; i <s.length() ; i++) {
            ss.put(s.charAt(i),1+ss.getOrDefault(s.charAt(i),0));
        }
        for (int i = 0; i <t.length() ; i++) {
            tt.put(t.charAt(i),1+tt.getOrDefault(t.charAt(i),0));
        }
       if (ss.equals(tt))
           return true;
       else
           return false;
    }
}
