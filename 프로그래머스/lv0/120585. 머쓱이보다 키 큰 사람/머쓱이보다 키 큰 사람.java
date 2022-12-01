class Solution {
    public int solution(int[] array, int height) {
        int higherNum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height){
                ++higherNum;
            }
        }
        return higherNum;
    }
}