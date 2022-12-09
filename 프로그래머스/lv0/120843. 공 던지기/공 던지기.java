class Solution {
    public int solution(int[] numbers, int k) {
        // int 배열에서 k번째로 공 던지는 사람 찾기
        // 1. 배열 0번 인덱스는 무조건 첫번째로 던지는 사람
        // 2. 한칸 건너뛰어서 공 던진다.
        //    공 던지는 사람이 i라고 하면 공 받는 사람은 i+2가 된다.
        // 3. 만일 i+2가 배열의 크기를 벗어나면 i+2-배열의크기 를 해주면
        //    공받을 사람의 인덱스 번호를 얻을 수 있다.
        /*
        int countNum = 0;
        int i = 0;
        int ballCatch = 0;
        int result = 0;
        while(countNum != k){
            ballCatch = numbers[i];
            countNum++;
            i = i+2;
            if(i >= numbers.length){
                i = i-numbers.length;
            }
        }
        result = ballCatch;
        
        return result;
        */
        
        return numbers[((k-1)*2)%numbers.length];
    }
}