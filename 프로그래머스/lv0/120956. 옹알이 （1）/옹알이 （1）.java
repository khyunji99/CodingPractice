class Solution {
    public int solution(String[] babbling) {
        // contains() 사용해서 [aya, ye, woo, ma] 배열 돌면서 있는지 확인
        // 확인해서 있으면 , 문자로 대체하기
        // 배열 다 돌았으면 , 문자 replace(, "") 로 대체해서 없애주기
        // 그렇게 했을 때 빈문자이면 머쓱이 조카가 발음할 수 있는 단어이다.
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(String s : babbling){
            for(String w : words){
                if(s.contains(w))
                    s=s.replace(w, ",");
                //s.replace() 를 다시 s에 넣어줘야한다. <- s=s.replace()
                // 그냥 s.replace()를 하면 replace한 새로운 문자가 생기는 것이다.
            }    
            
            s=s.replace(",", "");
            if(s.length()==0)
                answer++;
            
            System.out.println(s);
        }
        
        
        return answer;
    }
}