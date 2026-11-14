class Solution {
    public String sortVowels(String s) {

        List<Character> vowels = new ArrayList<>();

        for(char c: s.toCharArray()){
            if(isVowels(c)){
                
            vowels.add(c);

            }
        }

        Collections.sort(vowels);

        char[] arr = s.toCharArray();
        int index =0;

        for(int i=0;i<arr.length;i++){
            if(isVowels(arr[i])){
                arr[i] = vowels.get(index);
                index++;
            }
        }

        return new String(arr);
        
    }

    private boolean isVowels(char c){
        if("AEIOUaeiou".indexOf(c)!= -1){
            return true;
        }else{
            return false;
        }
    }
}