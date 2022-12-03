class Solution {
    public int solution(int n, int t) {
        // Math.pow(a, b) : a의 b거듭제곱 계산 (double형 리턴)
        // 1시간 -> 2배
        // 1시간 -> n*2
        // 2시간 -> (n*2)*2
        // t시간 -> n*(2)^t
        // 세균마리수 : n, 경과시간 : t
        return n * (int)Math.pow(2, t);
        
    }
}