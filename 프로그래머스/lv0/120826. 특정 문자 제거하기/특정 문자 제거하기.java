class Solution {
    public String solution(String my_string, String letter) {
        // String.replaceAll() : 문자열에서 특정 문자 제거하는 메서드 
        String answer = my_string;
        answer = answer.replaceAll(letter, "");
        // 변수 answer에 담긴 문자열에서 letter변수에 담긴 문자와
        // 같은게 있으면 그 문자의 자리를 "" 공백으로 대체한다.
        
        return answer;
    }
}