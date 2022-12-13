import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        // HashMap 사용 -> key, value 값
        // db 배열을 HashMap에 아이디를 key값으로 , 패스워드를 value값으로
        // entrySet() 메서드
        // : Map.Entry 인터페이스는 Map 객체의
        // 키와 값을 접근할 수 있는 getKey(), getValue() 함수가 존재함
        // 1. 아이디(key값)는 같고 패스워드(value값)가 다른 경우 -> wrong pw
        // 2. 아이디(key값)이 같은게 없는 경우 -> fail
        // 3. 아이디, 패스워드 둘다 같은 경우 -> login
        Map<String, String> map = new HashMap<String, String>();
        
        for(int i = 0; i < db.length; i++){
            map.put(db[i][0], db[i][1]);
        }
        System.out.println(map);
        for (Map.Entry<String, String> pair : map.entrySet()){
            if(pair.getKey().equals(id_pw[0])){
                System.out.println(pair.getKey());
                if(pair.getValue().equals(id_pw[1])){ // 아이디, 패스워드 다 같은경우
                    return "login";
                }else                            // 아이디만 같은 경우
                    return "wrong pw";
            }else{                               // 아이디 다르고 패스워드도 다른 경우
                if(!(pair.getValue().equals(id_pw[1])))
                    continue;
            }
            
        }
        return "fail";
    }
}