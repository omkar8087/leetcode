class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        int left =0;
        int right = n-1;

        int left_max = height[left];
        int right_max = height[right];

        while(left<right){
            if(left_max<right_max){
                left++;
                left_max = Math.max(left_max,height[left]);
                totalWater += left_max - height[left];
            }else{
                right --;
                right_max = Math.max(right_max,height[right]);
                totalWater += right_max - height[right];
            }
        }

        
        return totalWater;
        
    }
}