import java.util.Arrays;
import java.util.regex.Pattern;
class Solution {
    public int[] solution(String my_string) {
        // 1. 문자열에서 숫자인 문자들 추출하기
        // 2. 숫자인 문자들 숫자로 변환하여 숫자배열에 넣기
        // 3. 숫자배열 정렬하기 
        // * .length : 배열의 길이,크기
        // * .length() : 문자열의 길이
        my_string = my_string.replaceAll("[^0-9]", "");
        String[] str = my_string.split("");
        int[] answer = new int[str.length];
        for(int i = 0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}