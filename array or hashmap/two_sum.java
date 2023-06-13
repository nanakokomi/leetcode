package everydayExercise_2022_11;

import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
     int num = nums.length;
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j <num ; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public int[] twoSum(int[] nums, int target) {
        int num = nums.length;
        HashMap<Integer, Integer> prenum = new HashMap<Integer, Integer>();
        for (int i = 0; i <num ; i++) {
            int differ = target-nums[i];
            if (prenum.containsKey(differ)){
                return new int[]{prenum.get(differ),i};
            }
            else {
                prenum.put(nums[i],i);
            }
        }
    }
}
