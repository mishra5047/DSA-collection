class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder builder = new StringBuilder();
        
        for(int i =0; i < split.length; i++){
            if(i != split.length -1){
            builder.append(reverseString(split[i]) + " ");   
            }else{
            builder.append(reverseString(split[i]));
            }
        }
        
        return builder.toString();
    }
    
    public static String reverseString(String str){
        StringBuilder builder = new StringBuilder();
        char[] cArray = str.toCharArray();
        for(int i = cArray.length - 1; i >= 0; i--){
            builder.append(cArray[i]);
        }
        
        return builder.toString();
    }
}
