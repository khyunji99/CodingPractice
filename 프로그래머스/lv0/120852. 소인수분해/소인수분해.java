import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        // i는 2부터 n까지를 n으로 나누었을때 나머지가 0이면
        // i는 n의 약수이다.
        // 이때 n을 n / i의 몫으로 바꿔주고 다시 i를 2부터 돌리면서 다시 또 소인수분해하기
        // 그렇게 하다보면 2가 여러개 일 수 있고 3도 여러개일 수 있다.
        // 그런 중복을 방지하기 위해 Set 을 사용하자!!
        // Set을 만들어서 값을 넣어주면 알아서 중복된 값을 저장해주지 않는다.
        
        Set<Integer> set = new HashSet<>();
        
        int i = 2;
        int remainder = 1;
        while(true){
            remainder = n % i;
            if(remainder == 0){
                set.add(i);
                n = n / i;
                if(n == 1)
                break;
                i = 2;
            }else{
                i++;
            }
            
            
        }
        
        int[] answer = new int[set.size()];
        
        Iterator<Integer> iterator = set.iterator();
        i = 0;
        while(iterator.hasNext()){
            answer[i] = iterator.next();
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}