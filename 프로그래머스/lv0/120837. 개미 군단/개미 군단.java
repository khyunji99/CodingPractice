class Solution {
    public int solution(int hp) {
        // 5로 한번 나누고, 3으로 한번 나누고, 1로 나머지 채우기
        int result1 = (hp / 5);
        int result2 = (hp % 5) / 3;
        int result3 = ((hp % 5) % 3);
        
        return result1 + result2 + result3;
    }
}