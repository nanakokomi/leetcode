package everydayExercise_2022_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<>();
        for (String s : strs) {//s 是array中的字符串
            //int[] count = new int[26];
            //将字符串转化为字符数组char c
            char[] c = s.toCharArray();
            //for (char c:s.toCharArray()) {
            //count[c-'a']++;
            //}
            //char c 排序
            Arrays.sort(c);
            //把字符数组变成string 作为hash map 的key
            String key = String.valueOf(c);
           //不包含的写法！
          if (!map.containsKey(key)){
               map.put(key,new ArrayList<>());//不知道后面是什么时，用这个表示default
           }
           map.get(key).add(s);//将该字符串放在对应key的list中
       }
//            List<String> list = map.getOrDefault(key, new ArrayList<>());
//            list.add(s);
//            map.put(key, list);
           return new ArrayList(map.values());

        }
    }
}