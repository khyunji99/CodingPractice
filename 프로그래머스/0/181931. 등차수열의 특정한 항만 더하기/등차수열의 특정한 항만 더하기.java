class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = 1;
        for (boolean b : included) {
            if (b) {
                answer += a + (n - 1) * d;
            }
            n++;
        }
        return answer;
    }
}
