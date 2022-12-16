import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        // Map으로 풀어보기!!
        // key값에 평균점수, value값에 순위 넣기
        // ps. 순위 구하는 방법은 평균점수들을 int형 배열에 넣고 정렬한 후 순위를 매겨준다.
        // 그러고 key값 평균점수와 score배열의 원소 더해서 2로 나눈 평균점수와 같은지 비교후
        // 같으면 그 인덱스에 value값 answer 배열에 넣어주기
        
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int[] arr = new int[score.length];
        
        int[] answer = new int[score.length];
        
        // 평균점수 arr 배열에 넣기
        for(int i = 0; i < score.length; i++){
            arr[i] = (score[i][0] + score[i][1]);
        }
        
        int[] scoreNum = new int[arr.length];
        
        // arr배열 깊은복사해서 scoreNum 배열 만들기 (정렬해서 순위 구하기 위함)
        for(int i = 0; i < arr.length; i++){
            scoreNum[i] = arr[i];
        }
        
        Arrays.sort(scoreNum); // 작은 수부터 큰수로 정렬
        
        int rank = score.length;
        for(int i = 0; i < scoreNum.length; i++){
            map.put(scoreNum[i], rank);
            rank--;
            
        }
        
        
        int i = 0;
        for(int num : arr){
           answer[i] = map.get(num);
            i++;
        }
        
        
        return answer;
    }
}