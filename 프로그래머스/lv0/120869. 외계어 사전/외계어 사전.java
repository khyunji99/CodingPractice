import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        String[] checkArr = new String[dic.length];
        
        int count = 0;
        for(int i = 0; i < dic.length; i++){
            for(int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    count++;
                }
            }
            if(count == dic[i].length() && count == spell.length){
                return 1;
            }
            count = 0;
        }

        return 2;
    }
}