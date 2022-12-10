class Solution {
    public int solution(String my_string) {
        // 연산자는 +, - 만 존재
        // 문자열을 공백 기준으로 자르면,,? --> 숫자와 연산자만 남는다,,?
        String[] strArr = my_string.split(" ");
        int answer = 0;
        int num = 0;
        
        num = Integer.parseInt(strArr[0]);
        for(int i = 1; i < strArr.length; i+=2){
            if(strArr[i].equals("+")){
                answer = num + Integer.parseInt(strArr[i+1]);
            }
            else {
                answer = num - Integer.parseInt(strArr[i+1]);
            }
            num = answer;
        }
        
        return answer;
    }
}