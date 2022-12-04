import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        // [가장 큰 숫자, 가장 큰 숫자가 있는 배열의 인덱스값]
        // 1. 배열의 첫번째 인덱스의 요소값을 새로운 int temp 변수에 넣기
        // 2. 그 int 변수에 들어있는 값과 배열의 다음 인덱스 요소의 값과 비교
        // 3. 비교 후 더 큰 값을 다시 int temp 변수에 넣기
        // 4. 이것을 배열 요소 끝까지 반복해서 비교하기
        // 5. 그 temp 변수에는 가장 큰 수가 들어있다. 그리고 그 값이 있는 인덱스 찾기
        // Arrays.binarySearch(배열, 찾는값) : 배열에서 찾는값의 인덱스를 반환(int형 반환)
        int temp = array[0];
        int[] answer = new int[2];
        
        for (int i = 1; i < array.length; i++){
            if(temp < array[i]){
                temp = array[i];
            } else
                continue;
        }
        
        answer[0] = temp;
        answer[1] = Arrays.binarySearch(array, temp);
        return answer;
    }
}