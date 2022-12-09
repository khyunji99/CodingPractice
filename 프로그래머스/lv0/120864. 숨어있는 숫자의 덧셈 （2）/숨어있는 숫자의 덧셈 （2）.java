class Solution {
    public int solution(String my_string) {
        // 1. 소문자, 대문자 알파벳들 모두 공백으로 대체하기
        // 2. 공백별로 문자열 잘라서 StringBuilder에 붙인다음
        //    바로 int로 형변환해서 숫자에 더해버린다.
        // 3. 문자열 안에 남아있는 숫자 모두 이렇게 반복해서 더한다.
        my_string = my_string.replaceAll("[^0-9]", "-");
        // 주어진 문자열 숫자 외 나머지 공백으로 대체하기
        String[] numStr = my_string.split("-");
        // 공백을 기준으로 문자열 잘라서 문자열 배열에 넣기
        int answer = 0;
        for(int i = 0; i < numStr.length; i++){
            if(numStr[i].equals(""))
                continue;
            else
                answer += Integer.valueOf(numStr[i]);
        }
        // 문자열 배열 하나씩 원소 꺼내면서 int형변환해서 int변수에 더하기
        
        return answer;
    }
}