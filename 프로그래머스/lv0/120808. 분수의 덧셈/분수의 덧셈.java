class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        // 분모 num = num1 * num2, 분자 dnum = denum1*num2 + denum2*num1
        // 이렇게 하고 분모 num과 분자 dnum 의 최대공약수 찾아서 나누면
        // 기약분수가 되므로 그거 각자 answer[] 배열에 넣으면 된다.
        // ex) denum1 = 1, num1=2, denum2=3, num2=4
        // num = num1*num2 = 2*4 = 8
        // dnum = denum1*num2+denum2*num1 = 1*4+3*2=10
        // 8과 10의 최대공약수는 2 
        // 각각 분자, 분모 최대공약수로 나눠주면 5/4 가 된다.
        
        int[] answer = new int[2];
        int num = num1*num2;
        int dnum = denum1*num2+denum2*num1;
        int index = num > dnum? num:dnum;
        int gcd = 1; // 최대공약수 gcd
        
        // index전까지가 아닌 index까지 돌려줘야한다! index에서 나눠질수도 있기 때문이다!
        for(int i = 2; i <= index; i++){ // 분자와 분모의 최대공약수 구하는 코드
            gcd = num % i == 0 && dnum % i == 0 ? i : gcd;
        }
        // 최대공약수로 분수 약분해서 기약분수 만들기
        answer[0] = dnum/gcd;
        answer[1] = num/gcd;
        
        return answer;
    }
}