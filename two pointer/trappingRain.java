package everydayExercise_2022_11;

public class trappingRain {
    public int trap(int[] height) {
        int total = 0;
        int len = height.length;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        int[] minLR = new int[len];
        for (int i = 1; i < len-1; i++) {//i-1 ���� out of bound
        maxLeft[i] = Math.max(maxLeft[i-1],height[i-1] );
        }
        for (int i = len-2; i >= 0; i--) {//���ű��� len-2: out of bound,�����һ�����ÿ�
        maxRight[i] = Math.max(maxRight[i+1],height[i+1] );
        }
        for (int i = 0; i < len; i++) {
         minLR[i] = Math.min(maxLeft[i],maxRight[i] );
        }
        for (int i = 0; i < len; i++) {
            if (minLR[i]-height[i]>0)
                total=(minLR[i]-height[i])+total;
        }
        return total;
    }
    public int trap(int[] height) {
    int left = 0;int right = height.length-1;
    int LeftMax = height[left];
    int RightMax = height[right];
    int res = 0;
    if (height.length==0){
        return res;
    }
    while (left<right){
        if (LeftMax<RightMax){
            left++;//����ָ��˭С˭�͸���
            LeftMax=Math.max(LeftMax,height[left]);//���º�Ƚ���һ�����µ����ֵ
            res = LeftMax-height[left]+res;//if ����Ѿ��жϹ�˭С,left is bottleneck,������Ҫ����min(L,R)
        }
        else {
           right--;
           RightMax = Math.max(RightMax,height[right]);
           res = RightMax-height[right]+res;
        }

    }
    return res;

    }
}
