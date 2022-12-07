class Solution {
    public int solution(int n) {
        int i = 1;
        int factorialNum = 0;
        int answer = 1;
        
        while(true){
            answer *= i;
            // System.out.println("fac:" + answer + ", n: " + n);
            factorialNum = i;
            if(answer == n)
                break;
            else if (answer > n) {
                factorialNum -= 1;
                break;
            }
            i++;
        }
        
        return factorialNum;
    }
}