package everydayExercise_2022_11;

import java.util.HashSet;

public class duplicate {
    //≥¨ ±¡À£¨£¨£¨
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==nums[j]) return true;
//            }
//        }
//        return false;
//    }
    //Hashset
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
           if (set.contains(nums[i])) return true;
           set.add(nums[i]);

        }
        return false;

    }
}
