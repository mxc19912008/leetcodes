public class Solution {
    public String reverseString(String s) {
        if(s.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = n-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}