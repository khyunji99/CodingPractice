class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i += 2) {
            if (n % 2 == 0) answer += (int) Math.pow(i + 2, 2);
            else answer += i + 1;
        }
        return answer;
    }
}