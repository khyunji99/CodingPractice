import java.util.Arrays;
class Solution {
    public String solution(String s) {
        // indexOf()와 lastindexOf() 사용하기
        // indexOf(String str) : 문자열 앞에서부터 주어진 문자 찾아서 인덱스 반환
        // lastindexOf(String str) : 문자열 뒤에서부터 주어진 문자 찾아서 인덱스 반환
        // 두개를 사용해서 두개의 인덱스가 같으면 그 문자는 그거 하나만 있는거다.
        
        
        String[] strArr = s.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strArr.length; i++){
            if(s.indexOf(strArr[i]) == s.lastIndexOf(strArr[i]))
                sb.append(strArr[i]);
        }
        
        String str = sb.toString();
        String[] answer = str.split("");
        
        StringBuilder sba = new StringBuilder(); 
        Arrays.sort(answer);
        
        for(String alpha : answer){
            sba.append(alpha);
        }
        
        return sba.toString();
    }
}