import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {  
        // 1. int배열 Arrays.sort() 사용해서 오름차순으로 정렬
        // 2. int배열에서 가장 작은 두 수 곱하기 (int[0] * int[1])
        // 3. int배열에서 가장 큰 두 수 곱하기 (int[배열의 크기 - 1] * int[배열의 크기 - 2])
        // 4. 두개의 최대값 중 더 큰 수를 리턴
        
        Arrays.sort(numbers);
        
        int max1 = numbers[0] * numbers[1];
        int max2 = numbers[numbers.length-1]*numbers[numbers.length-2];
        
        return (int)Math.max(max1, max2);
    }
}