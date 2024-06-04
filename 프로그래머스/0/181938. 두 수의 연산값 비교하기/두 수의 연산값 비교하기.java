class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        return Math.max(Integer.parseInt(sb.append(a).append(b).toString()), 2*a*b);
    }
}