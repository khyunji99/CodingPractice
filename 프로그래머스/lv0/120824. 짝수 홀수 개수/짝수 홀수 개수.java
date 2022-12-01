class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddNum = 0;
        int evenNum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0)
                evenNum++;
            else
                oddNum++;
        }
        answer[0] = evenNum;
        answer[1] = oddNum;
        
        return answer;
    }
}