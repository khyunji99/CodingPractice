class Solution {
    public int solution(int num, int k) {
        // 1. 주어지는 정수값num 과 주어지는 숫자k 를 문자열로 형변환
        // 2. 문자열 num에서 문자열 k와 같은 값이 있는지 확인
        // 3. 없으면 -1 리턴 있으면 그 문자열의 인덱스값 리턴
        // String.value(num) : int타입이 String타입으로 변환
        // String에서 제공하는 contains()메서드 : 문자열 포함하고 있는지
        String str1 = String.valueOf(num);
        String str2 = String.valueOf(k);
        
        if(str1.contains(str2)){
            return str1.indexOf(str2) + 1;
        }else{
            return -1;
        }
        
        
    }
}