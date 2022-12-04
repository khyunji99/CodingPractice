class Solution {
    public String solution(String my_string) {
        // 1. 주어진 문자열에서 문자 인덱스 하나씩 확인
        // 2. 소문자면 그 인덱스의 문자열을 대문자로
        // 3. 대문자면 그 인덱스의 문자열을 소문자로
        // 4. StringBuilder에 문자열 붙이기
        // 65 ~ 90 : 대문자 알파벳
        // String.valueOf() : 기본 타입값 문자열로 반환
        // sb.toString() : 스트링빌더 문자열로 반환
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if ((int)my_string.charAt(i) >= 65 && (int)my_string.charAt(i) <= 90) {
                String upper = my_string.substring(i, i+1);
                sb.append(upper.toLowerCase());
            } else {
                String lower = my_string.substring(i, i+1);
                sb.append(lower.toUpperCase());
            }
        }
        
        return sb.toString();
    }
}