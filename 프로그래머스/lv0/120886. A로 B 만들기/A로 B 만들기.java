import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int solution(String before, String after) {
         // 1. before문자열 하나하나를 after문자열 하나하나 같은지 비교
        // 2. 같으면 그 문자 after문자열, before문자열에서 각자 삭제하고 before문자열 다음 인덱스로
        // 3. 그렇게 after문자열이 다 삭제되면 그건 만들 수 있는 것이므로 1 리턴
        String[] bArr = before.split("");
        String[] aArr = after.split("");
        
        List<String> bList = new ArrayList<String>(Arrays.asList(bArr));
        List<String> aList = new ArrayList<String>(Arrays.asList(aArr));
        
        for(int i = 0; i < bList.size(); i++){
            for(int j = 0; j < aList.size(); j++){
                if(bList.get(i).equals(aList.get(j))){
                    aList.remove(j);
                    break;
                }
            }
        }
        if(aList.size() == 0)
            return 1;
        else
            return 0;
    }
}