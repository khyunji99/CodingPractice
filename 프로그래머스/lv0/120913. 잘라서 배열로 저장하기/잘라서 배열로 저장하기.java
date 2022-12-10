class Solution {
    public String[] solution(String my_str, int n) {
        // substring(i, i+n+1) 으로  문자열 잘라서 n개만큼 꺼내서 배열에 넣기
        // 삼항연산자 사용해서 문자열의 길이가 n의 배수인지 아닌지 확인해서 각각 다른 길이 반환하기
        // 정해지는 길이로 배열 선언하고 for문으로 배열에 원소 집어넣기
        // 문자열 잘라서 배열에 넣을 때 문자열의 인덱스를 벗어나지 않도록 확인해주는 삼항연산자를 적어서
        // 문자열의 길이 넘어가지 않도록 해준다.
        int ln = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        
        String[] answer = new String[ln];
        
        int startIndex = 0;
        int endIndex = n;
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_str.substring(startIndex, endIndex);
            startIndex += n;
            endIndex = endIndex + n > my_str.length() ? my_str.length() : endIndex + n;
        }    

        return answer;
    }
}