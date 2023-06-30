package everydayExercise_2022_11;

public class two_sum2 {
    //·¨Ò»£¬old method
//    public int[] twoSum(int[] numbers, int target) {
//        int num = numbers.length;
//        for (int i = 0; i < num; i++) {
//            for (int j = i+1; j <num ; j++) {
//                if (numbers[i]+ numbers[j]==target){
//                    return new int[]{i,j};
//                }
//                if (numbers[i]+ numbers[j]>target){
//                   break;
//                }
//            }
//        }
//        return new int[0];
//    }
    public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length-1;
    while (left<right){if (numbers[left]+numbers[right]==target){
        return new int[]{left+1,right+1};
    }
        if (numbers[left]+numbers[right]<target){
            left++;
        }
       else
            right--;

    }
    return new int[]{left+1,right+1};

    }
}
