class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 1. 회전방향 right인 경우 : 배열 원소의 인덱스 뒤로 한칸씩 밀기
        // 2. 회전방향 left인 경우 : 배열 원소의 인덱스 앞으로 한칸씩 당기기
        int[] answer = new int[numbers.length];
        
        switch(direction){
            case "right":
                for(int i = 0; i < numbers.length-1; i++){
                    answer[0] = numbers[numbers.length-1];
                    answer[i+1] = numbers[i];
                }
                break;
            case "left":
                for(int i = 0; i < numbers.length-1; i++){
                    answer[numbers.length-1] = numbers[0];
                    answer[i] = numbers[i+1];
                }
                break;
        }
        
        return answer;
    }
}