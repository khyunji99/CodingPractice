class Solution {
    public String solution(String polynomial) {
        // 1. polynomial 문자열을 + 기준으로 잘라서 String배열 poly에 넣기
        // 2. poly배열 돌면서 x문자 가지고 있는 경우,
        //    x문자를 없애주고 그러고도 남은 문자가 있으면 그 문자는 x의 계수이다.
        //    남은 문자가 없고 문자 길이가 0이다 그러면 x의 계수는 1
        //    (x밖에 없었기 때문에 x 문자열 없애면 아무것도 안남는다.)
        //    계수를 num 변수에 int형으로 변환해서 더해주기
        // 3. poly배열 돌면서 x문자 가지고 있지 않는 경우,
        //    x문자가 없는데 문자이다 그러면 그건 상수이다. 상수는 constant 변수에 넣어준다.
        // 4. poly배열 다 돌고나면
        //    constant가 0이면 num + "x" 리턴해주고,
        //    constant가 0이 아니면 num + "x" + " + " + "constant" 리턴해준다.
        
        String[] poly = polynomial.split(" \\+ "); // \\ 써줘야 + 연산으로 오해 안한다!!
        int num = 0, constant = 0;
        
        
        for(String s : poly){
            if(s.contains("x")){
                s = s.replace("x", "");
                if(s.length() == 0){ // x만 있었던 경우
                    num += 1;
                }else{ // 숫자+x 이였던 경우
                    num += Integer.valueOf(s);
                }
            }else{
                constant += Integer.valueOf(s);
            }
        }
        // 테스트 5,6,7번 반례 : 상수만 있는 경우의 수 처리해줘야함
        // 테스트 8,10,12번 반례 : 1x는 x로 출력해야한다
        
        if(num == 1){ // x의 계수가 1인 경우
            // 1) 상수항 없고 x 계수가 1 인 경우
            if(constant == 0)
                return "x";
            else // 2) 상수항 있고 계수가 1인 경우
                return "x" + " + " + constant;
        }else if(num == 0){
            // 계수 없고 상수항만 있는 경우
            return String.valueOf(constant);
        }else{
            // 1이 아닌 계수 값이 있고 상수항 없는 경우
            if(constant == 0)
                return num + "x";
            else // 1이 아닌 계수 값이 있고 상수항 있는 경우
                return num + "x" + " + " + constant;
            
        }
        
    }
}