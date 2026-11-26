class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int watermax =0;

        int left = 0, right = n-1;
        while(left<right){
            int width = right - left;
            int length = Math.min(height[left],height[right]);
            int contained = width * length;
            watermax = Math.max(watermax,contained);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        
        return watermax;
    }
}