package everydayExercise_2022_11;

public class containMaxWater {
    //brute force
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int maxWater = (j-i)*Math.min(height[i],height[j] );
                res = maxWater;
                res = Math.max(maxWater,res);

            }
        } return res;
    }
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int res = 0;
        while (left<right){
            int maxWater = (right-left)*Math.min(height[left],height[right] );
            if (height[left]<height[right])
                left++;
            else
                right--;
            res = Math.max(maxWater,res);

        }
        return res;
    }

}
