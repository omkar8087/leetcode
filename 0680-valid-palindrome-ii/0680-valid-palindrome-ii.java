class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left =0,right =n-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return isValid(s,left+1,right)|| isValid(s,left,right-1);
            }
            left ++;
            right--;
        }
        return true;
    }

    private boolean isValid(String s,int left,int right){
        int n = s.length();
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}