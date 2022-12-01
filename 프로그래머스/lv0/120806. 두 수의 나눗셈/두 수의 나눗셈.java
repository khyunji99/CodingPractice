class Solution {
    public int solution(int num1, int num2) {
        
        double value = (double)num1 / num2;
        int result = (int)(1000*value);
        return result;
    }
}