package everydayExercise_2022_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<>();
        for (String s : strs) {//s ��array�е��ַ���
            //int[] count = new int[26];
            //���ַ���ת��Ϊ�ַ�����char c
            char[] c = s.toCharArray();
            //for (char c:s.toCharArray()) {
            //count[c-'a']++;
            //}
            //char c ����
            Arrays.sort(c);
            //���ַ�������string ��Ϊhash map ��key
            String key = String.valueOf(c);
           //��������д����
          if (!map.containsKey(key)){
               map.put(key,new ArrayList<>());//��֪��������ʲôʱ���������ʾdefault
           }
           map.get(key).add(s);//�����ַ������ڶ�Ӧkey��list��
       }
//            List<String> list = map.getOrDefault(key, new ArrayList<>());
//            list.add(s);
//            map.put(key, list);
           return new ArrayList(map.values());

        }
    }
}