import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int median = 0;
        if(array.length % 2 == 0){ // 배열 크기 짝수일때 중앙값 리턴
            int midValue = array[array.length/2];
            int sideValue = array[(array.length/2)+1];
            median = (midValue + sideValue) / 2;
        }else{ // 배열 크기 홀수일때 중앙값 리턴
            median = array[array.length / 2];
        }
        return median;
    }
}