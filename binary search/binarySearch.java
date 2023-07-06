package everydayExercise_2022_11;

public class binarySearch {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target)
                return i;
//            else{
//                return 0;
//            }
        }
        return -1;
    }
    public int seach(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {//如果[1] 这种，left 和right一样
            int mid = left+right / 2;//放在循环内更新 left+(right-left/2)：防止溢出
            if (nums[mid]==target)
                return mid;
            else if (nums[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }

}
