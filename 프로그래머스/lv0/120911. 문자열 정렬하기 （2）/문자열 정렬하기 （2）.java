import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        // 1. 문자열 모두 소문자로 바꾸기 : toLowerCase();
        // 2. 문자열 배열에 넣기 : split("");
        // 3. 문자열 배열 정렬 : Arrays.sort();
        // 4. 문자열 배열 다시 문자열로 변환 : StringBuilder로 문자열 배열 문자열로 만들기
        StringBuilder sb = new StringBuilder();
        
        my_string = my_string.toLowerCase();
        String[] strArr = my_string.split("");
        Arrays.sort(strArr);
        
        for(String word : strArr){
            sb.append(word);
        }
        
        String result = sb.toString();
        
        return result;
    }
}