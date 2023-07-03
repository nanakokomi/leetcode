package everydayExercise_2022_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        //����һ�������
        List<List<Integer>> threSum= new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            //�����������ʼԪ�ش���0����ֱ���˳�
            //ԭ�򣬴�ʱ����Ϊ��������飬��С����������0�ˣ�����֮�Ϳ϶�����0
            if (nums[i]>0)
                break;
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int left = i+1;
            int right = nums.length-1;
            int target  = 0-nums[i];
            while (left<right){
                if (nums[left]+nums[right]==target){
                    //�������Ľ�����뵽�������
                    threSum.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //ȥ�أ���Ϊ i ���䣬����ʱ lȡ������ֵ��ǰһ������ͬ�����Բ����ڼ��㣬ֱ����
                    while (left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right-1]){
                        right--;
                    }

                right--;//�� ��ָ�����ƣ�����ָ������
                left++;//�ҵ�һ��b��c�󣬼���Ų���������⣺������ҪŲ
                } else if (nums[left]+nums[right]>target) {
                  right--;//���û�ҵ���Ų����ʽ
                }
                else {
                 left++;
                }
            }
        }
        return threSum;
    }
}
