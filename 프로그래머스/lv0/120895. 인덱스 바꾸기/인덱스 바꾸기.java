class Solution {
    public String solution(String my_string, int num1, int num2) {
        // StringBuilder, StringBuffer 사용하면 문자열 수정 가능하다
        StringBuilder sb = new StringBuilder(my_string);
       
        sb.replace(num1, num1+1, my_string.substring(num2, num2+1));
        sb.replace(num2, num2+1, my_string.substring(num1, num1+1));
        
        return sb.toString();
    }
}