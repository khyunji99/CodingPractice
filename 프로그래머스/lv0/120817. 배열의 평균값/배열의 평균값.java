class Solution {
    public double solution(int[] numbers) {
        
        float sum = 0.0f;
        
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        return (float)(sum/numbers.length);
    }
}