class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += (n % 2 == 0) ? (int) Math.pow(n, 2) : n;
            n -= 2;
        }
        return answer;
    }
}