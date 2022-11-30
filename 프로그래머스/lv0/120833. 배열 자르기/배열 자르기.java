import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];
        // Arrays.copyOfRange(원본배열, 시작 인덱스, 끝인덱스)
        // 시작인덱스 ~ 끝인덱스-1 까지의 배열 항목 복사
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}