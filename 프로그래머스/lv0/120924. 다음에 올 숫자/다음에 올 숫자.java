class Solution {
    public int solution(int[] common) {
        // 인덱스 0번과 1번, 인덱스 2번과 1번을 비교해보면 된다.
        // common[1] - common[0] == common[2] - common[1] 같으면 등차수열
        // common[1] / common[0] == common[2] / common[1] 같으면 등비수열
        int d = 0; // 공차
        int r = 1; // 공비
        int answer = 0;
        if(common[1] - common[0] == common[2] - common[1]){ // 등차수열인 경우
            d = common[1] - common[0];
            answer = common[common.length-1] + d;
        }else { // 등비수열인 경우
            r = common[1] / common[0];
            answer = common[common.length-1] * r;
        }
        
        return answer;
    }
}