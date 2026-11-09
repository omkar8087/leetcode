class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater = 0;
        int left =0;
        int right =n-1;

        while(left<=right){
            int high = Math.min(height[left],height[right]);
            int width = right - left;
            int water = high * width;
            maxWater = Math.max(maxWater,water);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
        
    }
}