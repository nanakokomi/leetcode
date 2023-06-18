package everydayExercise_2022_11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class top_k {
    public static void main(String[] args) {
        int[]nums ={1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //int[] count = new int[nums.length+1];
//        int i =0;
//        for (int key:map.keySet()
//             ) {
//            count[i++] = key;
//        }
//        for (int key:map.keySet()
//             ) {
//            int i = map.get(key);
//            count[i]=key;
//        }
        List<Integer> count[] = new ArrayList[nums.length+1];
        for (int key:map.keySet()
             ){
            int i =map.get(key);
            if (count[i]==null){
                count[i]=new ArrayList<>();
            }
            count[i].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for (int j = count.length-1; j >=0; j--) {
            if (count[j] != null) {
                for (int c : count[j]
                ) {
                    result[index++] = c;
                    if (index == k) {
                    return result;}

                }
            }
        }
        return result;
    }
}
