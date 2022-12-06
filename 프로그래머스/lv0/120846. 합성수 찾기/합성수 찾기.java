class Solution {
    public int solution(int n) {
        // 1. 합성수가 아닌 수 = 소수 (약수가 나 자신과 1밖에 없는 수) 찾기
        // 2. for문을 돌려서 소수면 증감식으로 소수 아니면 count++ 해주기
        // 이중 for문을 돌리는 이유 : 1부터 주어지는 수 n까지 각각의 약수의 개수를 구해주기 위해서
        // 첫번째 for문은 1~n 까지 돌아주는 것, 두번째 for문은 돌아가는 수 하나하나의 약수를 구하기 위해서
        int answer = 0; // n = 10
        
        for(int i = 2; i <= n; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){ // 약수의 개수 구하기
                if(i % j == 0)
                    count++;
            }
            if(count > 2)
                answer++;
        }
        
        return answer;
    }
}