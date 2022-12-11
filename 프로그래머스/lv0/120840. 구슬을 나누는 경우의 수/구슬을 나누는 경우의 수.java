class Solution {
    public int solution(int balls, int share) {
        // 구슬 모두 다 다르게 생김
        // 머쓱이 구슬 수 : balls , 친구 줄 구슬 수 : share
        // balls = n , share = m
        // n(n-1)...(n-m+1) / m(m-1)(m-2)...1
        double answer = 1;
        double dball = (double)balls;
        double dshare = (double)share;
        
        for(int i = 0; i < dshare; i++){
            answer *= dball-i;
        }
        
        for(int i = 0; i < dshare; i++){
            answer /= dshare-i;
        }
        
        return (int)answer;
    }
}