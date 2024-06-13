import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int last = num_list[num_list.length - 1];
        int beforeLast = num_list[num_list.length - 2];
        
        answer[num_list.length] = beforeLast < last ? (last - beforeLast) : 2*last;
        
        return answer;
    }
}