class Solution {
    public String solution(String cipher, int code) {
        // 1. code 배수번째의 인덱스에 있는 문자 추출
        // 2. StringBuilder sb에 붙이기
        // substring() : 문자열에서 특정 문자열 추출하기
        StringBuilder sb = new StringBuilder();
        int j = 2;
        for(int i = code; i <= cipher.length(); ){
            sb.append(cipher.substring(i-1, i));
            i = j * code;
            j++;
        }
        
        return sb.toString();
    }
}