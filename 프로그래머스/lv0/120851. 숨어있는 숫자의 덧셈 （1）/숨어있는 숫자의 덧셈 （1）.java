import java.util.regex.Pattern;
class Solution {
    public int solution(String my_string) {
        // 1. 문자열 배열에 주어진 문자열을 분리해서 넣기
        // 2. 배열 원소 하나씩 숫자인지 확인하기
        // 3. 숫자이면 int로 형변환해서 변수에 계속 더하기
        // 4. 더한 값 변수 리턴하기
        int sum = 0;
        String[] str = my_string.split("");
        
        for(String word : str){
            boolean flag = Pattern.matches("[0-9]", word);
            if(flag){
                sum += Integer.parseInt(word);
            }
        }
        
        return sum;
    }
}