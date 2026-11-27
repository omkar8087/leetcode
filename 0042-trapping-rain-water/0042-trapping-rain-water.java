class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater =0;
        int left = 0, right = n-1;
        int leftWater = height[left];
        int rightWater = height[right];

        while(left<right){
            
            if(leftWater<rightWater){
                left++;
                leftWater = Math.max(leftWater,height[left]);
                totalWater += leftWater-height[left];
            }else{
                right--;
                rightWater = Math.max(rightWater,height[right]);
                totalWater += rightWater-height[right];
                
            }
        }

        return totalWater;
        
    }
}