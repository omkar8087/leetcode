class Solution {
    public boolean isPalindrome(String s) {
        String original = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] rev = original.toCharArray();

        int left =0, right = rev.length-1;
        while(left<right){
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;
            left++;
            right--;

        }

        String reversed = new String(rev);
        return original.equals(reversed);
        
    }
}