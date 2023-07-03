package everydayExercise_2022_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        //定义一个结果集
        List<List<Integer>> threSum= new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            //如果遍历的起始元素大于0，就直接退出
            //原因，此时数组为有序的数组，最小的数都大于0了，三数之和肯定大于0
            if (nums[i]>0)
                break;
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int left = i+1;
            int right = nums.length-1;
            int target  = 0-nums[i];
            while (left<right){
                if (nums[left]+nums[right]==target){
                    //将三数的结果加入到结果集中
                    threSum.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //去重，因为 i 不变，当此时 l取的数的值与前一个数相同，所以不用在计算，直接跳
                    while (left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right-1]){
                        right--;
                    }

                right--;//将 左指针右移，将右指针左移
                left++;//找到一次b，c后，继续挪动找其他解：两个都要挪
                } else if (nums[left]+nums[right]>target) {
                  right--;//如果没找到的挪动方式
                }
                else {
                 left++;
                }
            }
        }
        return threSum;
    }
}
