class Solution {
    public int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){ // n이 i의 배수
                ++count;
            }
        }
        
        
        return count;
    }
}