class Solution {
    public int solution(int n) {
        double k = Math.sqrt(n);
        if(n % k == 0){
            return 1;
        }
        return 2;
    }
}
// Math.pow <- 숫자의 거듭제곱 구하기 // double형
// Math.pow(5, 2); <- 5의 2승
// Math.sqrt <- 숫자의 제곱근(루트) 구하기 // double형