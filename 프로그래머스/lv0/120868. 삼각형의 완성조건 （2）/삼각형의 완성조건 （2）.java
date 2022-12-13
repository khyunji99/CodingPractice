class Solution {
    public int solution(int[] sides) {
        // 1. 주어지는 두 변 중 가장 큰 수가 가장 긴 변이 되는 경우
        // 2. 주어지는 두 변 말고 나머지 한변이 가장 긴 변이 되는 경우
        // ex) [ 11, 7 ]
        // 1. 11이 가장 긴 변이 되는 경우
        // --> 11 < 7 + k <= 11 --> 11 - 7 < k <= 11 --> 4 < k <= 11
        // => k = 가장 큰 변의 길이 - (가장큰변 길이 - 남은 한변의 길이) = 남은 한변의 길이
        // 2. 11, 7 외의 다른 한변이 가장 긴 변이 되는 경우
        // --> 11 < k < 11 + 7 --> 11 < k < 18(max+남은한변길이)
        // => k = 가장큰변의 길이 + 남은 한변길이 - 가장큰변길이 - 1
        
        int count = 0;
        
        if(sides[0] < sides[1]){
           // max = sides[1];   // max = 11, k = 11 - 4(max - 남은 한변길이)
            count = sides[0] + (sides[0] - 1); // max - (max - sides[0]);
            
        }else{
           // max = sides[0];
            count = sides[1] + (sides[1] - 1); // max - (max - sides[1]);
        }
        
        
        
        return count;
    }
}