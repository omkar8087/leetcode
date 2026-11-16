class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String result = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isValid(s,i,j)){
                    if((j-i+1)>result.length()){
                        result = s.substring(i,j+1);
                    }
                }
            }
        }

        return result;


        
    }

    private boolean isValid(String s,int i,int j){

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}