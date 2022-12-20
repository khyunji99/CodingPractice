class Solution {
    public int solution(int n) {
        
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        // 1, 2, 4, 5, 7, 8, 10, 11, 14, 16, 17, 19, 20, 22, 25, 26, 28, 29, 40, 41, 42
        // 숫자를 하나씩 늘려가면서 count 개수도 하나씩 늘려간다.
        // 이때 count를 셀때 숫자 3이 포함되거나 3의 배수이면 다음 숫자로 넘어가서 아니면 count++ 해준다.
        // 그렇게 count를 늘려갈때 주어진 숫자 n이 되면 늘려온 숫자를 반환해준다.
        int answer = 1; // 늘려갈 숫자 = 정답이다.
        int count = 1; // count가 주어진 n과 같으면 while문에서 빠져나와 count==n이 된 그때의 숫자를 반환한다.
        
        while(true){
            // 3의 배수가 아닌 경우 또는 숫자 3이 안들어있는 경우 --> count++
            if((answer % 3 == 0) || (String.valueOf(answer).contains("3"))){ 
                answer++;
            }
            // 3의 배수이거나 숫자 3이 들어있는 경우 --> 다음 숫자로 넘어가기
            else { 
                if(count == n)
                    break;
                
            	count++;
            	answer++;
            }
        }
        return answer;
    }
}