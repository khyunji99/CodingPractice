class Solution {
    public String solution(String bin1, String bin2) {
        // Integer.parseInt(String s, int radix)
        // 숫자형의 문자열을 첫번째 인자값으로 받고 변환할 진수값을
        // 두번째 인자값으로 받으면 진수에 맞춰 Integer 형(기본 숫자는 10진수이므로) 10진수로 반환해줌
        // Integer.toBinaryString(int i)
        // 10진수 i를 2진수로 만들어주는 함수
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2); // bin1이 2진수이니깐 2진수에서 10진수 int num1으로 바꿔줘 라고 한것
        int num2 = Integer.parseInt(bin2, 2);
        // bin1과 bin2를 2진수 -> 10진수 로 만들어준다.
        
        int num3 = num1 + num2;
        
        answer = Integer.toBinaryString(num3);
        
        return answer;
    }
}