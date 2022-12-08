import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        // 1. 배열 하나씩 꺼내서 n에서 뺀다
        // 2. 뺀 값을 절대값으로 만들어서 다른 값이랑 비교하기
        // Math.abs() : 절댓값 만드는 메서드 
        // 3. 절댓값이 가장 작은게 주어진 수 n이랑 가장 가까운 수
        Arrays.sort(array);
        int[] numArr = new int[array.length];
        int compare = Math.abs(n-array[0]);
        int answer = array[0];
        
        for(int i = 1; i < array.length; i++){
            if(compare > Math.abs(n-array[i])){
                compare = Math.abs(n-array[i]);
                answer = array[i];
            }
        }
        
        
        return answer;
    }
}