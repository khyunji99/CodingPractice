class Solution {
    public String[] solution(String[] quiz) {
        // 1. quiz 배열을 돌면서 공백을 기준으로 잘라서 String[] poly에 넣는다.
        //    -> poly 배열의 크기 = (숫자3개 + 연산1개 + =) = 5개
        //       poly 배열에 [숫자, 연산자(- 또는 +), 숫자, =, 숫자] 이렇게 들어갈 것이다.
        // 2. poly배열의 1번 인덱스가 - 연산자인지 + 연산자인지 if문으로 확인하고
        //    그에따라 알맞게 0번째 인덱스의 숫자와 2번째 인덱스의 숫자와 연산을 해준다.
        // 3. 연산을 한 결과값 result가 4번째 인덱스에 있는 숫자(= 값 다음으로 들어있는 숫자)와 같은지 확인하고
        // 값이 같으면 "O"를 다르면 "X"를 answer배열에 넣어준다.
        
        String[] answer = new String[quiz.length];
        // quiz = ["3 - 4 = -3", "5 + 6 = 11"]
        String[] poly = new String[5];
        
        
        for(int i = 0; i < quiz.length; i++){
            poly = quiz[i].split(" ");
            // quiz[1] 일때, poly = [3, -, 4, =, -3]
            // System.out.println(poly[i]);
            if(poly[1].equals("-")){ // 연산자가 - 인 경우
                if((Integer.parseInt(poly[0]) - Integer.parseInt(poly[2])) == Integer.parseInt(poly[4]))
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
            else{ // 연산자가 +인 경우
                if((Integer.parseInt(poly[0]) + Integer.parseInt(poly[2])) == Integer.parseInt(poly[4]))
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
        }
        
        
        
        return answer;
    }
}