class Solution {
    public int[] solution(int n) {
        // 1. 정수 n 이하의 홀수 담을 int배열 만들기
        // (n 짝수인지 홀수인지에 따라 배열크기 다르게 지정)
        // 2. 배열에 홀수 원소들 담기
        
        
        if (n % 2 == 1){ // n = 11
            int[] answer = new int[n/2 + 1];
            answer[0] = 1;
            for(int i = 1; i < n/2+1; i++){
                answer[i] = answer[i-1] + 2;
            }
            return answer;
        }
        else {
            int[] answer = new int[n/2];
            answer[0] = 1;
            for(int i = 1; i < n/2; i++){
                answer[i] = answer[i-1] + 2;
            }
            return answer;
        }
        
    }
}