import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length).map(i -> included[i] ? (a + i*d) : 0).sum();
    }
}