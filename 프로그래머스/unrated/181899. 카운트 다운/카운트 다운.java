import java.util.stream.IntStream;
class Solution {
    public int[] solution(int start, int end_num) {
        return IntStream.rangeClosed(-start, -end_num)
                    .map(i -> -i)
                    .toArray();
    }
}