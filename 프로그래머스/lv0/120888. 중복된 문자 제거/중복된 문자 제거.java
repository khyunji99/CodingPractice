import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        // 1. 문자열 쪼개서 문자 배열에 넣고 그걸 ArrayList 배열에 넣기
        // 2. 배열 원소 하나씩 비교하기 (이중 for문으로 확인)
        // 3. 같은 문자인지 확인하고 같으면 삭제하기
        // 4. 삭제할거 다 하고 문자열로 리턴해주기
        // Arrays.asList() : 일반 배열을 ArrayList로 변환
        
        
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        
//         String[] strArr = my_string.split("");
//         List<String> strList = new ArrayList<>(Arrays.asList(strArr));
        
//         for(int i = 0; i < strList.size(); i++){
//             for(int j = i+1; j < strList.size(); j++){
//                 if(strList.get(i).equals(strList.get(j)))
//                     strList.remove(j);
//             }
//         }
//         String answer = "";
        
//         for(String word : strList){
//             answer += word;
//         }
        
        
        return answer;
    }
}