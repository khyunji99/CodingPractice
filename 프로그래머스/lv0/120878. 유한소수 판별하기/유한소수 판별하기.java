class Solution {
    public int solution(int a, int b) {
        // 기약분수로 나타내었을 때 분모에 2 또는 5 있음 -> 유한소수
        // 2 또는 5 없음 또는 2와 5 외에 다른 소인수 있음 -> 무한소수
        // 유한소수 -> return 1 / 무한소수 -> return 2
        // 1. 분자와 분모의 최대공약수(두 수의 공통된 소인수를 모두 곱한 것)를 찾는다.
        // 2. 분모를 최대공약수로 나눠준다.
        // 3. 소인수가 된 분모를 가지고 2와 5로만 나누어지는지 확인한다.
        int greatestCommonDivisor = 1; // greatest common divisor : 최대공약수
        for(int i = 1; i <= a; i++){
            if(a % i == 0 && b % i == 0){
                greatestCommonDivisor = i;
            }
        }
        b = b / greatestCommonDivisor; // 분모 소인수로 만들기
        
        // 2 랑 5로 계속 나누었을 때 결국에 남는 값이 1이 되면 그건 유한소수
        while(true){
            if(b % 2 == 0){
                b = b / 2;
            }else if (b % 5 == 0){
                b = b / 5;
            }else{
                break;
            }
        }
        
        if(b == 1)
            return 1;
        else
            return 2;
        
    }
}