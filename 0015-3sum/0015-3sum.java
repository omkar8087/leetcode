class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> req = new ArrayList<>();
        int n = nums.length;
        int target = 0;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    req.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1])left++;
                    while(left<right && nums[right]==nums[right-1])right--;
                    left++;
                    right--;

                }else if(sum>target){
                    right --;
                }else{
                    left ++;
                }
            }
        }

        return req;
        
    }
}