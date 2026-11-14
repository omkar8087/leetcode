class Solution {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left =0;
        int right = n-1;

        while(left<right){
            if(!isVowels(arr[left])){
                left++;
            }else if(!isVowels(arr[right])){
                right--;

            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);


    }

    public static boolean isVowels(char s){
        if("aeiouAEIOU".indexOf(s)!=-1){
            return true;
        }else{
            return false;
        }
    }
}