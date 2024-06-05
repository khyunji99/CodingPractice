class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;

        if (a == b && b == c) {
            answer *= (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                    * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else if ((a == b && b != c) || (a == c && c != b) || (a != b && b == c)) {
            answer *= (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }

        return answer;
    }
}