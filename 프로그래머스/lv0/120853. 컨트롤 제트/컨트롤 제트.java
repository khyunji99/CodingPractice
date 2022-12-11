class Solution {
    public int solution(String s) {
        // contains() 사용해서 문자열에 Z가 있는지 확인하고 없으면 그냥 다 더하기
        // 1. 주어진 문자열 공백단위로 잘라서 String[] 배열에 넣기
        // 2. 원소 하나씩 돌리면서 원소가 Z랑 같은지 확인하는 구문 넣어서
        //    맞으면 그 전 인덱스의 값을 빼준다.
        // 3. 그렇게 String[] 배열 끝까지 다 돌린다.
        // boolean contains(String s) : 특정 문자열 포함되어있는지 확인하는 함수 (대,소문자 구분 o)
        String[] strArr = s.split(" ");
      //  int answer = 0;
      //  int temp = Integer.parseInt(strArr[0]);
        int answer = Integer.parseInt(strArr[0]);
        if(s.contains("Z")){ // Z문자열 포함된 문자열 일때
            for(int i = 1; i < strArr.length; i++){
                answer = strArr[i].equals("Z")? answer-Integer.parseInt(strArr[i-1]) : answer+Integer.parseInt(strArr[i]);
                
            }
        }else{ // 숫자로만 이루어진 문자열 그냥 모두 다 더하기
            answer = 0;
            for(String num : strArr){
                answer += Integer.parseInt(num);
            }
        }
        
        
        return answer;
    }
}