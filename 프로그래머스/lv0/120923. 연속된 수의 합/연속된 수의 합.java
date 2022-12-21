class Solution {
    public int[] solution(int num, int total) {
        // 연속된 정수
        // ex) num = 5, total = 15
        // 연속된 정수 5개를 모두 더했을 때 15가 되는 정수들을 오름차순으로 배열에 담기
        // x + x+1 + x+2 + x+3 + x+4 = 15
        // 5*x + (1+2+3+4) = 15  / num * x + (1+2+3+.....+num-1) = total
        // 5x = 15-10=5
        // x = 1
        int[] answer = new int[num];
        
        int pnum = 0; // 1부터 num-1 까지 모두 더한 숫자
        
        for(int i = 1; i < num; i++){ // 1부터 num-1까지 모두 더하기
            pnum+=i;
        }
        
        int x = (total - pnum) / num; // 연속되는 숫자 중 맨 처음 숫자
        
        for(int i = 0; i < num; i++){ // 정답 배열에 숫자 x부터 1씩 증가한 값 더한값 넣어주기
            answer[i] = x + i;        // answer = [1,1+1,1+2,1+3,1+4]
        }
        
        return answer;
        
        /*
        int[] answer=new int[num];
        int point1= total/num + (1-num)/2;
        for(int i=0; i<num; i++) {
            answer[i] = point1++;
        }
        return answer;
        */
        
        
    }
}