import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();

            int i = 0;
            while (i < n) {
                answer.add(num_list[i++]);
            }

            return answer.stream()
                    .mapToInt(k -> k)
                    .toArray();
    }
}