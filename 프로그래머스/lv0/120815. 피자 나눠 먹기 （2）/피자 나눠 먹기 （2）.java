class Solution {
    public int solution(int n) {
        // 피자 6조각으로 잘라줌
        // 사람수 x 조각수 = 6의 배수
        int answer = 0;
        
        for(int i = 1; ; i++) {
            if((n * i) % 6 == 0){
                answer = (n * i) / 6;
                break;
            }
        }
        
        return answer;
    }
}