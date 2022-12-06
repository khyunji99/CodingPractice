import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String[] strArr = my_string.split("");
        List<String> strList = new ArrayList<String>(Arrays.asList(strArr));
        
        for(int i = 0; i < strList.size(); i++){
            for(int j = i+1; j < strList.size(); j++){
                if(strList.get(i).equals(strList.get(j))){
                    strList.set(j, "");  // 중복되는 값이 있는 공간 빈공간으로 만들어버리기
                }
            }
        }
        
        String answer = "";
        
        for(String word : strList){
            answer += word;
        }
        
        
//         두번째 푸는 방법
//         String answer = "";
        
//         for(int i = 0; i < my_string.length(); i++){
//             if(!answer.contains(String.valueOf(my_string.charAt(i)))){
//                 answer += String.valueOf(my_string.charAt(i));
//             }
//         }
        
        
        return answer;
    }
}