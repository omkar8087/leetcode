class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left =0,right = n-1;

        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!isValid(l)){
                left ++;
            }else if(!isValid(r)){
                right --;
            }else{
                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }
                left ++;
                right --;
            }

            

        }
        return true;

        
    }

    private boolean isValid(char c){
        return Character.isLetterOrDigit(c);
    }
}