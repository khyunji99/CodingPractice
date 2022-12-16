class Solution {
    public int solution(String A, String B) {
        // 문자열 A의 맨 뒤의 문자를 잘라내서 String temp 변수에 넣기
        // 그러고 temp를 맨 앞으로 두고 그 뒤에 남은 문자열 A 붙여주기
        // 문자열 B와 같은지 물어보고 같으면 return 1 하고
        // 문자열 길이까지 반복하다가 반복문 빠져나오면 return -1하기
        
        // temp 변수에 A의 마지막 문자값을 넣음
        // copyA에는 temp + A의 0부터 (A의 문자길이 -1)를 넣어줌
        // A = copyA로 치환 후 조건문으로 확인함
        
        int answer = -1;
        String copyA = "";
        String temp = "";
        
        if(A.equals(B)){ // 처음부터 A와 B 문자가 같은 경우 -> 문자열 안밀어도 같으므로 0번
            answer = 0;
        }else{ // A문자와 B문자가 같지 않으면 문자열 밀기
            for(int i = 0; i < A.length(); i++){
                temp = A.substring(A.length()-1);
                copyA = temp + A.substring(0, A.length()-1);
                A = copyA;
                
                if(A.equals(B)){
                    System.out.println(A);
                    answer = i + 1; // i가 0부터 시작하므로 1더해줌
                }
            }
        }
        
        
        return answer;
    }
}