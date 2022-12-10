class Solution {
    public int solution(int M, int N) {
        // M : 가로 , N : 세로
        // M, N > 1 --> 자르는 횟수 : (N-1) + (M-1) X N = MN - 1
        // M = 1 또는 N = 1 -> 자르는 횟수 : M-1 또는 N-1
        // M=1, N=1 -> 자르는 횟수 0
        
        int answer = (M > 1) && (N > 1) ? M*N - 1 : (M == 1) && (N > 1)? N-1 : (M > 1) && (N==1)? M-1 : 0;
        
        return answer;
    }
}