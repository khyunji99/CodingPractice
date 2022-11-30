import java.util.Arrays;
class Solution {
    public int solution(int[] sides) { // sides 배열 : 삼각형의 세 변 길이 담긴 배열
        // 세개 값 중 가장 큰 값 < 나머지 두 값의 합 -> 삼각형 o -> 1리턴
        Arrays.sort(sides);
        if(sides[2] < sides[1] + sides[0]){
            return 1;
        } else
            return 2;
    }
}