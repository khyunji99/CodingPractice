import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(String numbers) {
        // 1. 문자열 numbers에서 문자를 하나씩 StringBuilder sb에 붙인다.
        // 2. 문자를 하나 붙이고 나서 숫자로 된 영어인지 물어보고 맞으면
        //    어느 영어표기에 해당하는지에 따라서 문자열 숫자를 sb2에 붙인다.
        // 3. 그렇게 for문으로 문자열 길이 끝까지 돌려서 확인 다하고
        //    StringBuilder sb2를 long 타입으로 형변환해서 return 한다.
        // hashMap 이용..?
        Map<String, String> map = new HashMap<String,String>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        
        
        
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for(int i = 0; i < numbers.length(); i++){
            sb.append(numbers.substring(i, i+1));
            if(map.containsKey(sb.toString())){ //containsKey() : 주어진 key값이 있는지 확인 boolean리턴
                
                answer += map.get(sb.toString()); // 해당하는 key값에 대한 value값 가져와서 문자열에 붙이기
                
                sb.setLength(0); // sb 초기화해서 처음부터 새로운 문자열 붙이기
            }
        }
        
        
        
        
        
        return Long.parseLong(answer);
    }
}