class 중복된숫자개수 {
    public int solution(int[] array, int n) {
        int count = 0;
        
        for (int i = 0; i < array.length; i++){
            if(array[i] == n){
                ++count;
            } else {
                continue;
            }
        }
        return count;
    }
}